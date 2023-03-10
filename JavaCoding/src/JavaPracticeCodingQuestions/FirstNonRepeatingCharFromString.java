package JavaPracticeCodingQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharFromString {

    private static char findFirstNonRepeatingChar(String s) {
        s = s.toLowerCase();
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c: s.toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        for (char c: s.toCharArray()) {
            if (charMap.get(c) == 1) {
                return c;
            }
        }

        return 'X';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string here -> ");
        String s = scanner.nextLine();

        char firstNonRepeatingChar = findFirstNonRepeatingChar(s);
        if (firstNonRepeatingChar != 'X') {
            System.out.println("First non repeating character from the String " + s + " is -> " + firstNonRepeatingChar);
        } else {
            System.out.println("No character found.");
        }
    }
}
