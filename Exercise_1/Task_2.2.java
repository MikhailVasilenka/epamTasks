import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Dragon's age: ");
        int age = in.nextInt();
        int n; // головы
        int g; // глаза
        if (age<200){
            n=(age*3)+3;
            g = n*2;
            System.out.println("Heads: " + n);
            System.out.println("Eyes: " + g);
        }

        int on1,og1;
        if (age>200 && age<300){
            n=(199*3)+3;
            g = n*2;
            int n1=((age-199)*2); //головы после 200 лет
            int g1 = n1*2; // + глаз после 200 лет
            on1 = n+n1;
            og1 = g+g1;
            System.out.println("Heads: " + on1);
            System.out.println("Eyes: " + og1);
        }
        if (age>300){
            n=(199*3)+3;
            g = n*2;
            int n1=((101)*2); //головы после 200 лет
            int g1 = n1*2; // + глаз после 200 лет
            on1 = n+n1;
            og1 = g+g1;
            int n2=(age-299); //головы после 300 лет
            int g2=n2*2;
            on1=n+n1+n2;
            og1=g+g1+g2;
            System.out.println("Heads: " + on1);
            System.out.println("Eyes: " + og1);
        }

    }
}
