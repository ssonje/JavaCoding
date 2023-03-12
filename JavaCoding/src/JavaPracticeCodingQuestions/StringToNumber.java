package JavaPracticeCodingQuestions;

public class StringToNumber {

    private static int reverseNumber(int number) {
        int answer = 0;
        while (number != 0) {
            int rem = number % 10;
            answer = answer * 10 + rem;
            number /= 10;
        }

        return answer;
    }

    private static int convertStringToNumber(String s) {
        s = s.toLowerCase();
        int number = 0;
        int length = s.length();
        for (int i = length - 1; i >= 0; i--) {
            int x = s.charAt(i) - '0';
            number = number * 10 + x;
        }

        return reverseNumber(number);
    }

    public static void main(String[] args) {
        String number = "123";
        System.out.println("String to number = " + convertStringToNumber(number));
    }
}
