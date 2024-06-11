public class Swap{
    public static void main(String[] args) {
        int number = 78;
        int anotherNumber = 32;

        int swap = number;
        number = anotherNumber;
        anotherNumber = swap;
        System.out.println(number);
        System.out.println(anotherNumber);
    }
}