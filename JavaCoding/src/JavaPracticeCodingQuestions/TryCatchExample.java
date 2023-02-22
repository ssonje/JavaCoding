package JavaPracticeCodingQuestions;

public class TryCatchExample {

    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("ArithmeticException is catch.");
            arithmeticException.printStackTrace();
        }
    }

}
