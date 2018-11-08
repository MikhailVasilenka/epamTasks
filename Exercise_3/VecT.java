/*  Developer: Mikhail Vasilenka
 *  Date: 04.11.2018
 *  Version: 1.0
 *
 *  Description:
 *  This program can:
  *  -finds first met local minimum (maximum).
  *  -checks whether all elements of vector are in ordered form.
  *  -finds arithmetical and geometrical progressions.
  *  -finds maximum and minimum of vector.
  *  -line search
  *  -Binary search
  *  -Insert Sort
  *  -Quick Sort*/

import java.util.Scanner;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class SortException extends Exception{
    public SortException(String message) {
        super(message);
    }
}

class myVector {
    private Random rnd = new Random();
    private int Z = rnd.nextInt(15);    // Defines the size of vector
    private double[] N = new double[Z];
    private boolean b=false;

    // Random filling of the vector
    public void Add() {
        for (int i = 0; i < Z; i++) {
            double buff = (double) rnd.nextInt(100);
            N[i] = buff;
        }
    }
    //Output of vector
    public void OutVector(){
        for (int i=0; i<Z; i++){
            System.out.print(N[i] + " ");
        }
    }
    //Get size of vector
    public int GetSize(){
        int counter=0;
        for (int i=0; i<Z; i++){
            counter++;
        }
        return counter;
    }
    //finding first met local minimum (maximum).
    public double findLocMax(){
        double locMax=0.1;
        for (int i=0; i<Z; i++){
            if (i<Z-2) {
                if (N[i] < N[i + 1] && N[i + 1] > N[i + 2]) {
                    locMax = N[i + 1];
                    b = true;
                    break;
                }
            }
        }
        return locMax;
    }
    public double findLocMin(){
        double locMin=0.1;
        for (int i=0; i<Z; i++){
            if (i<Z-2) {
                if (N[i] > N[i + 1] && N[i + 1] < N[i + 2]) {
                    locMin = N[i + 1];
                    b = true;
                    break;
                }
            }
        }
        return locMin;
    }
    public void OutResLoc(){
        if(!b){
            System.out.println(-1);
        }
        else
            System.out.println("Local maximum is: " + findLocMax() + "\nLocal minimum is: " + findLocMin());

        if (findLocMax()==0.1){
            System.out.println("Local maximum is not found! (0.1 - Default) ");
        }
        if (findLocMin()==0.1){
            System.out.println("Local minimum is not found! (0.1 - Default) ");
        }
    }
    // checking whether all elements of vector are in ordered form
    public boolean Check() throws SortException {
        if (N[0] < N[1]) {
            for (int i = 1; i < Z - 1; i++) {
                if (N[i] < N[i+1]) {
                    b = true;
                } else {
                    b = false;
                }

            }
        }
        else if (N[0] > N[1]){
            for (int i = 1; i < Z - 1; i++) {
                if (N[i] > N[i+1]) {
                    b = true;
                } else
                    b = false;
            }
        }
        if (!b)  throw new SortException("Vector isn't in ordered form!");
        return b;
    }
    public void OutResForm(){
        if (Check()){
            System.out.println("All elements of vector are in ordered form!");
        }
        else
            System.out.println("Vector isn't in ordered form!");
    }
    //finding arithmetical and geometrical progressions
    public double ArithmeticP(){
        double sum=0;
        for (int i=0; i<Z; i++) {
            sum+= N[i];
        }
        return sum / Z;
    }
    public double GeometricalP(){
        double gem=1;
        for (int i=0; i<Z; i++) {
            gem*= N[i];
        }
        return Math.pow(gem, (double)1/Z);
    }
    public void OutResProgressions(){
        System.out.println("Arithmetic: " + ArithmeticP() + "\nGeometrical: " + GeometricalP());
    }
    //finding maximum and minimum of vector.
    public double findMax() {                    // Finds the max element of vector
        double max=0;
        max = N[0];
        for (int i = 1; i < Z; i++) {
            if (max < N[i]) {
                max = N[i];
            }
        }
        return max;
    }
    public double findMin() {                    // Finds the min element of vector
        double min=0;
        min = N[0];
        for (int i = 1; i < Z; i++) {
            if (min > N[i]) {
                min = N[i];
            }
        }
        return min;
    }
    public void OutResVrMaxMin(){
        if (findMax()==findMin()){
            System.out.println(-1);
        }
        else
            System.out.print("MAX: " + findMax() + "\nMIN: " + findMin());
    }
    //line searching
    public double LineSearch(double key) {
        for (int i=0; i<Z; i++)
            if (N[i]==key) return key;
        return -1;

    }
    public void OutResLnS(double key) {
        if (LineSearch(key) == -1) {
            System.out.println("Number not found!");
        }
        else
            System.out.println("Found! - " + key);
    }
    //Insertion sort
    public void InsertSort(){
        for (int i=1; i<Z;i++){
            for (int j=i;(j>0 && N[j-1]>N[j]); j--){
                double tmp=N[j-1];
                N[j-1]=N[j];
                N[j]=tmp;
            }
        }
    }
    //Binary searching
    public double BinarySearch(double key) {
        int left=0, right=Z, mid;
        while (left<=right)
        {
            mid=left+(right-left)/2;
            if (key<N[mid]) right=mid-1;
            else if (key>N[mid]) left=mid+1;
            else return mid;
        }
        return -1;
    }
    public void OutResBnS(double key) {
        if (BinarySearch(key) == -1) {
            System.out.println("Number not found!");
        }
        else
            System.out.println("Found! - " + key);
    }
    // Quick sorting
    public void QuickSort(int left, int right){
        int i=left, j=right;
        double tmp, mid = N[(left+right)/2];
        do {
            while (N[i] < mid) i++;
            while (N[j] > mid) j--;
            if (i<=j){
                if (i<j){
                    tmp = N[i];
                    N[i] = N[j];
                    N[j] = tmp;
                }
                i++;
                j--;
            }
        }
        while (i<=j);
        if (i<right) QuickSort(i, right);
        if (left<j) QuickSort(left, j);
    }
}

public class VecT {

    private final static Logger LOGGER = LogManager.getLogger(VecT.class);

    public static void main(String[] args) {
        myVector N = new myVector();
        Scanner in = new Scanner(System.in);
        System.out.println("What do you want to do with Vector: ");
        System.out.println("Filling ... \n");
        N.Add();
        System.out.println("1. Find first met local minimum and maximum." +
                         "\n2. Check whether all elements of vector are in ordered form." +
                         "\n3. Find arithmetical and geometrical progressions." +
                         "\n4. Find maximum and minimum of vector." +
                         "\n5. Find the element of Vector. (Line Searching)" +
                         "\n6. Find the element of Vector. (Binary Searching)" +
                         "\n7. Insert sorting of vector." +
                         "\n8. Quick sorting of vector. " +
                         "\n9. Exit.");
        while(true){
            System.out.print("Your choice: ");
        int k = in.nextInt();
        LOGGER.info("User luser!");
            switch (k) {
                case 1:
                    System.out.println("Finding first met local minimum and maximum ...");
                    N.findLocMax();
                    N.findLocMin();
                    N.OutResLoc();
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Checking whether all elements of vector are in ordered form ...");
                    N.Check();
                    N.OutResForm();
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Finding arithmetical and geometrical progressions ...");
                    N.OutResProgressions();
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("Finding maximum and minimum of vector ...");
                    N.OutResVrMaxMin();
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.print("Enter the number for the line searching: ");
                    double x = in.nextDouble();
                    N.OutResLnS(x);
                    System.out.println("\n");
                    break;
                case 6:
                    System.out.print("Enter the number for the binary searching: ");
                    N.InsertSort();
                    double x1 = in.nextDouble();
                    N.OutResBnS(x1);
                    break;
                case 7:
                    System.out.println("Insertion sorting ... ");
                    N.InsertSort();
                    N.OutVector();
                    System.out.println("\n");
                    break;
                case 8:
                    System.out.println("Quick sorting ... ");
                    try{
                    N.QuickSort(0, N.GetSize() - 1);
                    N.Check();} catch(Exception SortException){

                }
                    N.OutVector();
                    System.out.println("\n");
                    break;
                case 9:
                    System.out.println("Exit. ");
                    return;
                default:
                    System.out.println("Entering error!");
                    return;
                }
            }
        }
    }

