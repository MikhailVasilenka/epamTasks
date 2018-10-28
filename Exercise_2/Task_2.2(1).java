// можно проще через строки: сравнение исходной строки со строкой reverse();

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the natural number: ");
        int N = in.nextInt();
        int N1=N;
        int count = 0;
        int i = 0;
        boolean b=false;

        while (N1 % 10 != 0) {
            count++;
            N1 = N1 / 10;
        }

        int[] mas = new int[count+1];
        while (i < count) {
            mas[i] = N % 10;
            i++;
            N=N/10;
        }

        for (i = 0; i < count; i++) {
            for (int j = count-1; j > 0; j--) {
                if (mas[i] != mas[j]) {
                    System.out.println("Not a palindrome!");
                    return;
                }
                else b=true;
                i++;
              }
            }
        if (b) {
            System.out.println("Palindrome!");
        }
    }
}