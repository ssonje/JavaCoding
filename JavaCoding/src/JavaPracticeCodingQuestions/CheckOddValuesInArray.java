package JavaPracticeCodingQuestions;

import java.util.Scanner;

public class CheckOddValuesInArray {

    private static void checkOddValuesInArray(int arr[], int size) {
        for (int i=0; i<size; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("Odd element detected & it is " + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        // Get input from user
        Scanner scanner = new Scanner(System.in);
        int size = 5;
        int arr[] = new int[size];

        System.out.print("Enter 5 elements - ");
        for (int i=0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Check whether the integer array contains odd values or not
        checkOddValuesInArray(arr, size);
    }

}
