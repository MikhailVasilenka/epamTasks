import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1, y1, x2, y2, x3, y3;
        System.out.println("Enter three points(x,y): ");

        System.out.println("First point: ");
        System.out.print("x: "); x1 = in.nextInt();
        System.out.print("y: "); y1 = in.nextInt();

        System.out.println("Second point: ");
        System.out.print("x: "); x2 = in.nextInt();
        System.out.print("y: "); y2 = in.nextInt();

        System.out.println("Third point: ");
        System.out.print("x: "); x3 = in.nextInt();
        System.out.print("y: "); y3 = in.nextInt();

        double st = 0.5d;

        int ABx = (int) Math.pow((x1-x2),2);
        int ABy = (int) Math.pow((y1-y2),2);
        double AB = Math.pow((ABx+ABy),st);

        int BCx = (int) Math.pow((x2-x3),2);
        int BCy = (int) Math.pow((y2-y3),2);
        double BC = Math.pow((BCx+BCy),st);

        int ACx = (int) Math.pow((x1-x3),2);
        int ACy = (int) Math.pow((y1-y3),2);
        double AC = Math.pow((ACx+ACy),st);

        if((AB + BC) > AC && (AB + AC) > BC && (AC + BC) > AB){
            System.out.println("Triangle exist!");
            if(AB*AB==AC*AC+BC*BC || AC*AC==AB*AB+BC*BC || BC*BC==AC*AC+AB*AB){
                System.out.println("Rectangular triangle!");
            }
        }
        else
            System.out.println("Triangle don't exist!");
    }
}
