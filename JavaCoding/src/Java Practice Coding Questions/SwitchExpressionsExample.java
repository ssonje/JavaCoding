import java.util.Scanner;

public class SwitchExpressionsExample {

    public static void main(String[] args) {
        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice from 1,2,3 -> ");
        int choice = scanner.nextInt();

        // Switch case example
        switch (choice) {
            case 1:
                System.out.println("You've selected Choice 1.");
                break;

            case 2:
                System.out.println("You've selected Choice 2.");
                break;

            case 3:
                System.out.println("You've selected Choice 3.");
                break;

            default:
                System.out.println("Please select appropriate choice.");
                break;
        }
    }
}
