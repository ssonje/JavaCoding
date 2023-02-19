public class ImmutableStrings {

    public static void main(String[] args) {
        String s = "java";
        System.out.println("String s before concatenating random string = " + s);

        // Concat some random string to string `s`
        s.concat(" is a programming language");

        // Getting same result after concatenating the random string to string `s`
        System.out.println("String s after concatenating random string = " + s);
    }

}
