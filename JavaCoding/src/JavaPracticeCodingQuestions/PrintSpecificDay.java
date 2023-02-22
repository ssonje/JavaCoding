package JavaPracticeCodingQuestions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintSpecificDay {

    public static void main(String[] args) {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println("Date => " + date);
    }

}
