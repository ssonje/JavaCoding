package JavaPracticeCodingQuestions;

public class NullPointerExceptionExample {

    private static void nullPointerExample(String s, int length) {
        for(int i=0; i<length; i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        nullPointerExample(null, 3);
    }
}
