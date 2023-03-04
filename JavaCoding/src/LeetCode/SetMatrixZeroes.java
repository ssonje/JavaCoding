package LeetCode;

public class SetMatrixZeroes {

    private static void fillRowWithZeroes(int[][] arr, int col) {
        for (int i=0; i<arr.length; i++) {
            arr[i][col] = 0;
        }
    }

    private static void fillColWithZeroes(int[][] arr, int row) {
        for (int i=0; i<arr[row].length; i++) {
            arr[row][i] = 0;
        }
    }

    private static void setZeros(int[][] arr, int rows, int cols) {
        boolean[][] zeros = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    zeros[i][j] = true;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (zeros[i][j]) {
                    fillRowWithZeroes(arr, i);
                    fillColWithZeroes(arr, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,1}, {1,0,1}, {1,1,1}};
        int rows = arr.length;
        int cols = arr[0].length;
        setZeros(arr, rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }

            System.out.print("\n");
        }
    }
}
