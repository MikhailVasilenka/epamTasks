import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = in.nextInt();
        System.out.print("Enter the number b: ");
        int b = in.nextInt();
        a+=b;
        b=a-b;
        a=a-b;
        System.out.println("New a: " + a + "\nNew b: " + b);
    }
}
