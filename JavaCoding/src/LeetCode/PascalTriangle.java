package LeetCode;

public class PascalTriangle {

    public static void main(String[] args) {
        int size = 5;
        int[][] arr = new int[size][size];

        for (int i=0; i<size; i++) {
            for (int j=0; j<= i; j++) {
                arr[i][j] = 0;
            }
        }

        for (int i=0; i<size; i++) {
            for (int j=0; j<= i; j++) {
                if (j==0 || j==i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }

        for (int i=0; i<size; i++) {
            for (int j=0; j<= i; j++) {
                System.out.print(arr[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
