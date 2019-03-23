// Программа находит арифметическое и геометрическое среднее цифр шестизначного числа

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter six digit number: ");
        int dec = in.nextInt();

        int arf=0, geo=1;
        int[] b = new int[6];
        for (int i = 0; i < 6; i++) {
            b[i] = dec % 10;
            dec = dec / 10;
            arf +=b[i];
            geo *= b[i];
        }

        // среднее арифметическое
        double aref = arf/(double)6;
        System.out.println("Arithmetical mean: " + aref);

        //среднее геометрическое
        double st = (double)1/6;
        double geom = Math.pow(geo,st);
        System.out.println("Geometric mean: " + geom);
    }
}
