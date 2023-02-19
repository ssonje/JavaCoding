public class EnumExample {

    private enum Level {
        EASY,
        MEDIUM,
        HARD
    }

    public static void main(String[] args) {
        Level myLevel = Level.EASY;

        switch (myLevel) {
            case EASY -> System.out.println("Selected level is Easy Level");
            case MEDIUM -> System.out.println("Selected level is Medium Level");
            case HARD -> System.out.println("Selected level is Hard Level");
        }
    }

}
