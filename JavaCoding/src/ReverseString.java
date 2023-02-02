import java.util.Scanner;

public class ReverseString {

    // Question - How do you reverse a string in Java?

    public static void main(String[] args) {
        // Get string input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String - ");
        String s = scanner.nextLine();

        // Get required variables setup here
        int length = s.length();
        char[] charArray = s.toCharArray();

        // Reverse string
        for (int i=0; i<=length/2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[length - i - 1];
            charArray[length - i - 1] = temp;
        }

        // Print the reverted string
        System.out.println("Reversed String = " + (new String(charArray)));
    }

}
