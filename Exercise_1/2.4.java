import java.util.Scanner;
import java.lang.String;

public class Main {

        public static void main ( String[] args ) {
            int day, month, year;
            Scanner in = new Scanner( System.in );
            System.out.println( " Enter the date - day, month, year : " );
            day = in.nextInt();
            month = in.nextInt();
            year = in.nextInt();
            if ( (year % 4 == 0  || (year % 4 ==0 && year % 400 ==0)) && month ==2 ){
                if ( day < 29 ) {
                    day+=1;
                }
                else {
                    day = 1;
                    month+=1;
                }
            }
            else {
                if ( month == 10 || month == 12 || month ==1 || month == 3 || month == 5 || month == 7  ) {
                    if ( day < 31 ) {
                        day+=1;
                    }
                    else {
                        if ( day > 31 && month < 12){
                            day=1;
                            month+=1;
                        }
                        else {
                            day = 1;
                            month = 1;
                            year+=1;
                        }
                    }
                }
                else {
                    if ( month ==2 ) {
                        if ( day < 28) {
                            day+=1;
                        }
                        else {
                            day=1;
                            month+=1;
                        }
                    }
                    else {
                        if (day < 30) {
                            day += 1;
                        } else {
                            day = 1;
                            month += 1;
                        }
                    }
                }
            }
            System.out.println( " The next day is :" + day + "." + month + "." + year + ".");
        }
    }