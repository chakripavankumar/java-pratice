package Excercise1;

import java.util.Scanner;

//Write a function to print the sum of all odd numbers from 1 to n.
public class question2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the value of n");
        int n= sc.nextInt();
        oddnumbers(n);
        sc.close();
    }
    public static int oddnumbers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }

        }
        System.out.println(" the sum of odd numbers for the given range of " + n + "is" + sum);
        return  sum;
    }

}
