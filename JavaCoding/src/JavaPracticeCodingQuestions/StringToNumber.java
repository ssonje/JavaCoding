package JavaPracticeCodingQuestions;

public class StringToNumber {

    private static int convertStringToNumber(String s) {
        s = s.toLowerCase();
        int number = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            int x = s.charAt(i) - '0';
            number = number * 10 + x;
        }

        return number;
    }

    public static void main(String[] args) {
        String number = "123";
        System.out.println("String to number = " + convertStringToNumber(number));
    }
}
