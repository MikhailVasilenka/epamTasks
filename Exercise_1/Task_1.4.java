//код изменен , отличено от блок-схемы

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter four digit number: ");
        String s1 = in.nextLine();

            if (s1.charAt(0) < s1.charAt(1) && s1.charAt(1) < s1.charAt(2) && s1.charAt(2) < s1.charAt(3)){
                        System.out.println("Increasing!");
            }

            if (s1.charAt(0) > s1.charAt(1) && s1.charAt(1) > s1.charAt(2) && s1.charAt(2) > s1.charAt(3)){
                        System.out.println("Decreasing!");
            }

                    if(s1.charAt(0) == s1.charAt(1) || s1.charAt(1) == s1.charAt(2) || s1.charAt(2) == s1.charAt(3)){
                        System.out.println("Your number " + s1 + " don't work with our condition!");
                    }
                    else if( s1.charAt(0) > s1.charAt(1) && s1.charAt(1) < s1.charAt(2) && s1.charAt(2) > s1.charAt(3)){
                        System.out.println("Your number " + s1 + " don't work with our condition!");
                    }
                    else if (s1.charAt(0) < s1.charAt(1) && s1.charAt(1) > s1.charAt(2) && s1.charAt(2) < s1.charAt(3)){
                        System.out.println("Your number " + s1 + " don't work with our condition!");
                    }
                    else if (s1.charAt(0) < s1.charAt(1) && s1.charAt(1) < s1.charAt(2) && s1.charAt(2) > s1.charAt(3)){
                        System.out.println("Your number " + s1 + " don't work with our condition!");
                    }
                    else {
                            System.out.println("Your number " + s1 + " don't work with our condition!");
                    }

        }

    }

