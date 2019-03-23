import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a, b: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int n=a*b;
        while(a!=0 && b!=0){
            if(a>b){
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        System.out.println("NOD is: " + (a + b));
        System.out.println("NOK is: " + (n/(a + b)));
    }
}
