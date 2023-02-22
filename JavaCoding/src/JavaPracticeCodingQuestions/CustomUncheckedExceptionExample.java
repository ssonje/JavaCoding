package JavaPracticeCodingQuestions;

public class CustomUncheckedExceptionExample {

    public static void main(String[] args) {
        String name = null;
        try {
            if (name == null) {
                throw new EmptyNameException("String name should not be empty");
            }

            System.out.println("Printing non empty string - " + name);
        } catch(EmptyNameException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Unchecked Exception - Example
class EmptyNameException extends RuntimeException {
    public EmptyNameException(String errorMessage) {
        super(errorMessage);
    }
}
