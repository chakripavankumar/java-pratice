package AllMix;
//Fibonacci sequence numbers depending upon their position in the series can be
//calculated using the general formula for
//Fibonacci numbers given as, Fn = Fn-1 + Fn-2, where Fn is the (n + 1)th term and n > 1.
public class question1 {
    public static void main(String[] args) {
// Define the number of Fibonacci numbers to generate

        int n=12;
        // Initialize the first two Fibonacci numbers
        int fristnum=0;
        int secondnum=1;
        // Print the first two Fibonacci numbers
        System.out.println("fibonacci series up to "+ n + "terms");
        System.out.println( fristnum + " ," + secondnum);
        // Loop to generate the next Fibonacci numbers
        for (int i = 2; i <n ; i++) {
            // Calculate the next Fibonacci number
            int nextNum=fristnum+secondnum;
            // Print the next Fibonacci number
            System.out.print("," + nextNum);
            // Update the variables for the next iteration
            fristnum=secondnum;
            secondnum=nextNum;
        }
    }
}

