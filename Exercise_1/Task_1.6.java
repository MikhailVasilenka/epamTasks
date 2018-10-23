import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter seven digit number: ");
        String s1 = in.nextLine();
        StringBuffer s = new StringBuffer(s1);
        s.reverse();
        System.out.println("Reverse: " + s);
    }
}
