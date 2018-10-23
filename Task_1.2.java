package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the weight(kg): ");
        int wkg = in.nextInt();
        int wmg, wgr, wtn;
        wmg = wkg*1_000_000;
        wgr = wkg*1000;
        wtn = (int) (wkg*0.001);
        System.out.println("MG: " + wmg);
        System.out.println("GR: " + wgr);
        System.out.println("TN: " + wtn);


    }
}
