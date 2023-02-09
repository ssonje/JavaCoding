public class PyramidPattern {

    private static void printPyramid(int n) {
        for(int i=1; i<=n; i++) {
            // Printing dash instead of dash (`-`)
            for(int j=1; j<=n-i; j++) {
                System.out.print("-");
            }

            // Print stars (`*`)
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPyramid(5);
    }
}
