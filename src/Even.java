
//Print all even numbers till n.

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please  enter the range/ number in which we will find out number of even numbers");
        int numb= sc.nextInt();
        for (int i=0 ; i<=numb; i++){
            if (i%2==0){
                System.out.println( "these are the even numbers in the range" +i);
            }
        }

    }
}
