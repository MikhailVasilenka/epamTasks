import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double S;
        System.out.print("Enter the outer Radius: ");
        int r1 = in.nextInt();
        System.out.print("Enter the inner Radius: ");
        int r2 = in.nextInt();
        if(r1<r2){
            System.out.println("Error! Outer Radius < Inner Radius!");
        }
        S = 3.14*((r1*r1)-(r2*r2));
        System.out.print("Ring area: ");
        System.out.printf("%.2f", S);

    }
}
