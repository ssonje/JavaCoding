import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindStringInTextFile {

    private static boolean isFileContainsString(File file, String s) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            if (scanner.nextLine().contains(s)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Load file
        File file = new File("D:\\Projects\\JavaCoding\\JavaCoding\\src\\Resources\\sample.txt");
        String s = "Beast";

        // Check if file contains string `s` or not
        try {
            if (isFileContainsString(file, s)) {
                System.out.println("File contains the String `" + s + "`.");
            } else {
                System.out.println("File doesn't contains the String `" + s + "`.");
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
