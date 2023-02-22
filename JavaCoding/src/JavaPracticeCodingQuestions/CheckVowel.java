package JavaPracticeCodingQuestions;

import java.util.Scanner;

public class CheckVowel {

    private static Boolean checkVowel(String s) {
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string here -> ");
        String s = scanner.nextLine();

        // Check vowel in the string
        if (checkVowel(s)) {
            System.out.println("Vowel is present in the string `" + s + "`");
        } else {
            System.out.println("Vowel is not present in the string `" + s + "`");
        }
    }

}
