import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        char []mas = new char[]{ 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'  };
        System.out.print("Enter the symbol: ");
        char ch = (char) System.in.read();
        int length = mas.length;
        int i=0;
        boolean b=true;
        while(i<length){
            if (ch == mas[i]){
                System.out.println("Vowel symbol!"); // гласная
                b=true;
                break;
            }
                else b=false;
            i++;
        }
        if(b==false){
            System.out.println("Consonant symbol!"); // согласная
        }

    }
}
