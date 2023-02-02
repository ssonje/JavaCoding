import java.util.Scanner;

public class SwapTwoNumbers {

    private static void swapNumbers(int a, int b) {
        System.out.println("Before swapping a = " + a + " and b = " + b);

        // Swap two numbers
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping a = " + a + " and b = " + b);
    }

    private static void swapNumbersWithoutUsingThirdVariable(int a, int b) {
        System.out.println("Before swapping a = " + a + " and b = " + b);

        // Swap two numbers
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping a = " + a + " and b = " + b);
    }

    public static void main(String[] args) {
        // Get integer input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two Numbers - ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Swap numbers using traditional way (third variable)
        System.out.println("Swapping two numbers using third variable - ");
        swapNumbers(a, b);

        // Swap numbers without using third variable
        System.out.println("Swapping two numbers without using third variable - ");
        swapNumbersWithoutUsingThirdVariable(a, b);
    }

}
