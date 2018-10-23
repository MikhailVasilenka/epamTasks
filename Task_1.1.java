
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number a: ");
        int a = in.nextInt();
        System.out.print("Enter the number b: ");
        int b = in.nextInt();
        System.out.print("Enter the number c: ");
        int c = in.nextInt();

        if(a == b && b == c) {
            System.out.println("\n" + "Equal!");
        }
        else {
            System.out.println("\n" + "Defferent!");
        }
    }
}
