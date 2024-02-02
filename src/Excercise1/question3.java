package Excercise1;

import java.util.Scanner;

// Write a function which takes in 2 numbers and returns the greater of those two.
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the first number");
        int n1= sc.nextInt();
        System.out.println("please enter the second number");
        int n2=sc.nextInt();
      sumoftwo(n1,n2);
    }
    public  static  int sumoftwo( int n1, int n2){
        return ( n1>n2) ? n1:n2;
    }
}
