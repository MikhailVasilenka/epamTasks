import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the natural number: ");
        int N = in.nextInt();
        int buff;
        int max = N%10;
        N = N/10;
        while(N%10!=0){
            buff=N%10;
            if (buff>max){
                max = buff;
            }
            else {
                N = N/10;
            }
        }
        System.out.println("Max number is: " + max);
    }
}
