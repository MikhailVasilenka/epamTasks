import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int num, numOfDiv = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the natural number: ");
        num = in.nextInt();
        System.out.print("The dividers of your number: ");
        for (int divider = 2; divider <= num / 2; divider++) {
            if (num % divider == 0) {
                if (Fun (divider)){
                    numOfDiv++;
                    System.out.println(divider);
                }
            }
        }
        if (numOfDiv == 0) {
            System.out.println(" Your number is prime!");
        }
    }

    private static boolean Fun(int num) {
        for (int divider = 2; divider <= num / 2; divider++) {
            if (num % divider == 0) {
                return false;
            }
        }
        return true;
    }
}
