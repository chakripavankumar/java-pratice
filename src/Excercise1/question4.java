package Excercise1;

import java.util.Scanner;

//Write a function that takes in the radius as input and returns the circumference of a circle.
public class question4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the radius");
       double radius= sc.nextDouble();
    double circumfrane= radiusmain(radius);
        System.out.println(" the circumfrane of the given circle radius is " + circumfrane);
    }
    public  static int radiusmain( double r){
        return (int) (2 * Math.PI * r);
    }
}
