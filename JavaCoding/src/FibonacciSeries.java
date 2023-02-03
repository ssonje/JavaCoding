import java.util.Scanner;

public class FibonacciSeries {

    private static int getFibSum(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return getFibSum(n - 1) + getFibSum(n - 2);
    }

    public static void main(String[] args) {
        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number -> ");
        int number = scanner.nextInt();

        System.out.println("Fibonacci Sequence till `" + number + "` is as follows - ");
        for (int i=0; i<=number; i++) {
            System.out.print(getFibSum(i) + ", ");
        }
    }

}
