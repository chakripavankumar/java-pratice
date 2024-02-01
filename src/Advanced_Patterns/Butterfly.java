package Advanced_Patterns;

public class Butterfly {
    public static void main(String[] args) {
        int n=4;
        //First half -> upper half
        //outer loop -> looping through upper half rows
        for (int i = 1; i <=n ; i++) {
            // 1st part -> printing starts = wrt row number -> i
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces= 2 * (n-i);
            // printing the pattern with spaces
            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" ");
            }
            // 2nd part
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
           // lower half
        for (int i = n ; i>=1 ;i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            int spaces= 2* (n-i);
            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
