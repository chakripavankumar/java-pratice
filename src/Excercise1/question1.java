package Excercise1;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the 1st number");
         int numb1= sc.nextInt();
        System.out.println("please enter the 2nd number");
        int numb2=sc.nextInt();
        System.out.println("please enter the 3rd number");
        int numb3=sc.nextInt();
        int avg= calculateAvg(numb1,numb2,numb3);
        System.out.println(" the avg od the given 3 numbers is" + avg);
    }
    public  static  int calculateAvg( int numb1, int numb2,int numb3){
        return (numb1+numb2+numb3)/3;
    }
}
