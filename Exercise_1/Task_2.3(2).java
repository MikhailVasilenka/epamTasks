import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int []mas = new int[]{ 65, 69, 73, 79, 85, 97, 101, 105, 111, 117 };
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the symbol: ");
        String s1 = in.nextLine();
        boolean b = true;

        int l = s1.length();
        if (l>1){
            System.out.println("Error! Enter only one symbol!");
            b=false;
        }

        if(b==true) {
            int sh = s1.charAt(0); // присваеваем sh значение строки s1 по ASCII
            int length = mas.length;
            int i = 0;
            boolean b1 = true;
            while (i < length) {
                if (sh == mas[i]) {
                    System.out.println("Vowel symbol!"); // гласная
                    b1 = true;
                    break;
                } else b1 = false;
                i++;
            }
            if (b1 == false) {
                System.out.println("Consonant symbol!"); // согласная
            }
        }

    }
}