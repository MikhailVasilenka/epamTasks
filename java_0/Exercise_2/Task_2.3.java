import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        boolean b;
        System.out.println("Enter the natural number: ");
        int N = in.nextInt();
        if(N==1){     //число 1 не является простым
            System.out.println("It's a composite number. ");
            return;
        }
        if(N==2){    // число 2 простое
            System.out.println("It's a simple number. ");
            return;
        }
        if ((N & 1) == 0){
            b=false;
        }
        else{
            i=3; // минимальное нечетное простое число
            b=true; // по умолчанию считаестя простым
            while(i*i<=N){
                /*Если i - ДЕЛИТЕЛЬ N, то число N составное и b = false.
                  В противном случае увеличиваем делитель i на 2*/
                if(N%i==0){
                    b=false;
                    break;
                }
                else
                    i+=2;
            }
        }
        // Выводим значение b. Если b в цикле не изменилась на false, то мы получим True
        System.out.println(" If true — Simple \n If false - Composite \n ———————————————————");
        System.out.println(" Your is: " + b);
    }
}
