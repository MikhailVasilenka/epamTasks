import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int age = 0, head = 3, eyes;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(; age < n; age++) {
            if (age >=300) head +=1;
            else if(age >=200) head +=2;
            else head +=3;
        }
        eyes = head*2;
        System.out.println("At " + n + " ages the Dragon will have " + head + " heads and " + eyes + " eyes.");
    }
}

