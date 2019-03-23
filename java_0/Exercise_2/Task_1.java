import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0; // количество бросков
        int a=0; // Начальное значение диапазона - "от"
        int b=2; // Конечное значение диапазона - "до"
        int heads = 0;
        int tails = 0;
        System.out.println("Heads or Tails?");
        String s1 = in.nextLine();
        String s = s1.toLowerCase();
        if (s.equals("heads") || s.equals("tails")) {

            while (n < 1001) {
                int rand = a + (int) (Math.random() * b);
                if (rand == 1) {
                    heads++;
                } else {
                    tails++;
                }
                n++;
            }
            if (s.equals("heads")){
                System.out.println("After 1000 throws Heads was " + heads + " times!");
            }
            else {
                System.out.println("After 1000 throws Tails was " + tails + " times!");
            }
        }
        else {
            System.out.println("Incorrect input!");
            return;
        }

    }
}
