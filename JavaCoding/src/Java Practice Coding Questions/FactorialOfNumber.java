import java.util.Scanner;

public class FactorialOfNumber {

    private static int findFactorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * findFactorial(n-1);
    }

    public static void main(String[] args) {
        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number -> ");
        int n = scanner.nextInt();

        // Find factorial of entered number
        System.out.println("Factorial of `" + n + "` is `" + findFactorial(n) + "`");
    }

}
