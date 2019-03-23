import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int num, numOfDiv = 0;
        Scanner in = new Scanner(System.in);
        int sum=0;
        System.out.print("Enter the natural number: ");
        num = in.nextInt();
        System.out.println("The dividers of your number: ");
        for (int divider = 2; divider <= num / 2; divider++) {
            if (num % divider == 0) {
                    numOfDiv++;
                    sum+=divider;
                    System.out.println(divider);
            }
        }
        if (numOfDiv == 0) {
            System.out.println(" Your number is prime!");
        }
        if ((sum+1)==num){
            System.out.println("Your number is perfect!");
        }
        else
            System.out.println("Your number isn't perfect!");
    }
}
