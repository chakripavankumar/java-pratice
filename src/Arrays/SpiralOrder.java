package Arrays;

import java.util.Scanner;

public class SpiralOrder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        int m= sc.nextInt();
        int matrix [] []=  new  int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
}
