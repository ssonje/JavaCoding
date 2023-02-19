import java.util.Scanner;

public class StringPalindrome {

    private static boolean isStringPalindrome(String s) {
        int length = s.length();
        for (int i=0; i<=length/2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Get input from User
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String -> ");
        String s = scanner.nextLine();

        // Check if the string is palindrome or not
        if (isStringPalindrome(s)) {
            System.out.println("String `" + s + "` is palindrome.");
        } else {
            System.out.println("String `" + s + "` is not palindrome.");
        }
    }

}
