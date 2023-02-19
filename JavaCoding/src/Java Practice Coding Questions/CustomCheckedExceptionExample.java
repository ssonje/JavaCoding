import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CustomCheckedExceptionExample {

    public static void main(String[] args) {
        String fileName = "ABC.txt";
        try {
            Scanner file = new Scanner(new File(fileName));
            if (file.hasNextLine()) {
                System.out.println(file.nextLine());
            }
        } catch(FileNotFoundException e) {
            System.out.println("File Not Found Exception.");
        }
    }
}

// Checked Exception - Example
class IncorrectFileNameException extends Exception {
    public IncorrectFileNameException(String errorMessage) {
        super(errorMessage);
    }
}
