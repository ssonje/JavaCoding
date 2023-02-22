package JavaPracticeCodingQuestions;

import java.util.Scanner;

public class SumOfArrayElements {

    private static int getSumOfArrayElements(int arr[], int size) {
        int sum = 0;

        for (int i=0; i<size; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr1[];
        Scanner scanner = new Scanner(System.in);

        // Take input from User
        System.out.print("Enter size of first array -> ");
        int size1 = scanner.nextInt();
        arr1 = new int[size1];

        System.out.print("Enter " + size1 + " elements for first array -> ");
        for(int i=0; i<size1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Get sum of all elements of array
        System.out.println("Sum of Array Elements is = " + getSumOfArrayElements(arr1, size1));
    }
}
