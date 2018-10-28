import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the natural number: ");
        String s = in.next();
        String s1="";
        int i=s.length();
        while (i>0){
            s1+=s.charAt(i-1);
            i--;
        }
        if (s.equals(s1)){
            System.out.println("Palindrome!");
        }
        else{
            System.out.println("Not a palindrome!");
        }
    }
}
