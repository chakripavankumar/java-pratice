package Arrays;

import java.util.Scanner;

public class twoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int rows= sc.nextInt();
        int col=sc.nextInt();
        int [] [] numbers= new  int[rows][col];
        // inner loops-> col
        //outer loops-> rows
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <col ; j++) {
              numbers[i][j]=sc.nextInt();
            }
        }
        //for searching x
        int x= sc.nextInt();
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <col ; j++) {
             if (numbers[i][j]==x){
                 System.out.println(" the location is("+ i + ", "+ j + ")");
             }
            }
        }

    }
}


