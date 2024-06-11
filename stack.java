public class Stack {
    int size;
    int top;
    int[]array;
    Stack(int capacity){
        top = -1;
        size = capacity;
        array = new int[size];
    }
    public void printStack(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }else{
            System.out.println("stack elements");
            for (int i = 0; i<=top;i++){
                System.out.println(array[i]+"");
            }
            System.out.println();
        }
    }
    


    boolean isFull(){
        return(top == size-1);
    }
    boolean isEmpty(){
        return(top == -1);
    }
     void push(int item){
        if (isFull()){
            System.out.println("stack overflow");
        }else{
            array[top+1]=item;
            top++;
        }
        
        
     }
     void pop(int item){
        if (isEmpty()){
            System.out.println("stack is empty");
        }else{
            array[top-1]=item;
            top--;
        }
        

        
     }
     
     }
