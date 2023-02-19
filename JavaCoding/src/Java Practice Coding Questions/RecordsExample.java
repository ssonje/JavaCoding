public class RecordsExample {

    public record RecordExample(int a, String b) {

    }

    public static void main(String[] args) {
        RecordExample recordExample = new RecordExample(10, "Sanket");
        System.out.println("Value of a = " + recordExample.a());
        System.out.println("Value of b = " + recordExample.b());
    }

}
