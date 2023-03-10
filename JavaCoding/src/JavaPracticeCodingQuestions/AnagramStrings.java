package JavaPracticeCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class AnagramStrings {

    private static boolean areStringsAnagrams(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char c: s1.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c: s2.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c) == 1) {
                    map.remove(c);
                } else {
                    map.put(c, map.get(c) - 1);
                }
            } else {
                map.put(c, 1);
            }
        }

        return map.isEmpty() ? true : false;
    }

    public static void main(String[] args) {
        String s1 = "Stop";
        String s2 = "Pots";

        if (areStringsAnagrams(s1, s2)) {
            System.out.println("String are anagram of each other.");
        } else {
            System.out.println("String are not anagram of each other.");
        }
    }

}
