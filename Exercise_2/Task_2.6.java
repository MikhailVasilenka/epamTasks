import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int differentDigitsCount = 0;
        int[] digitsCount = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.println( " Enter the natural number: ");
        number = in.nextInt();
        while (number != 0) {
            digitsCount[(number % 10)]++;
            number /= 10;
        }

        for (int i = 0; i < digitsCount.length; i++) {
            if (digitsCount[i] > 0) {
                differentDigitsCount++;
            }
        }
        System.out.println(differentDigitsCount);
    }
}
