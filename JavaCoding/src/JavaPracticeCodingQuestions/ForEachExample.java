package JavaPracticeCodingQuestions;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

    public static void main(String[] args) {
        // Create List
        List<String> list = new ArrayList<>();
        list.add("Sanket");
        list.add("Dilip");
        list.add("Sonje");

        for(String s: list) {
            System.out.println(s);
        }
    }
}
