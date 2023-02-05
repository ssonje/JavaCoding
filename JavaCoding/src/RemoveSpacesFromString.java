import java.util.Scanner;

public class RemoveSpacesFromString {

    private static String removeAllSpaces(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) != ' ') {
                stringBuilder.append(s.charAt(i));
            }
        }

        return stringBuilder.toString();
    }

    private static String removeLeadingAndTrailingSpaces(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        int startIndex = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == ' ') {
                continue;
            } else {
                startIndex = i;
                break;
            }
        }

        int endIndex = 0;
        for (int i=s.length()-1; i>=0; i--) {
            if (s.charAt(i) == ' ') {
                continue;
            } else {
                endIndex = i;
                break;
            }
        }

        if (startIndex == endIndex) {
            return "";
        }

        for (int i=startIndex; i<=endIndex; i++) {
            stringBuilder.append(s.charAt(i));
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        // Get input from User
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string -> ");
        String s = scanner.nextLine();

        // Remove all spaces from string
        System.out.println("Removed all spaces from String `" + s + "` and final result is = `" + removeAllSpaces(s) + "`");

        // Remove leading and trailing spaces from string
        System.out.println("Removed leading and trailing spaces from String `" + s + "` and final result is = `" + removeLeadingAndTrailingSpaces(s) + "`");
    }

}
