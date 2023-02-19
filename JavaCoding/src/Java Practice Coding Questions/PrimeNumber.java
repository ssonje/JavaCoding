import java.util.Scanner;

public class PrimeNumber {

    private static Boolean isPrimeNumber(int number) {
        if (number == 0) {
            return false;
        }

        if (number == 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        for (int i=2; i<=number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number -> ");
        int number = scanner.nextInt();

        // Check if number is prime or not
        if (isPrimeNumber(number)) {
            System.out.println("Number `" + number + "` is a prime number.");
        } else {
            System.out.println("Number `" + number + "` is not a prime number.");
        }
    }

}
