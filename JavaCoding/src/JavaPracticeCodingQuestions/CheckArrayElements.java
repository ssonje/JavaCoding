package JavaPracticeCodingQuestions;

import java.util.Scanner;

public class CheckArrayElements {

    private static boolean checkElementsOfArray(int arr1[], int  size1, int arr2[], int size2) {
        if (size1 != size2) {
            return false;
        }

        for(int i=0; i<size1; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int arr1[], arr2[];
        Scanner scanner = new Scanner(System.in);

        // Take input from User
        System.out.print("Enter size of first array -> ");
        int size1 = scanner.nextInt();
        arr1 = new int[size1];

        System.out.print("Enter " + size1 + " elements for first array -> ");
        for(int i=0; i<size1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter size of first array -> ");
        int size2 = scanner.nextInt();
        arr2 = new int[size2];

        System.out.print("Enter " + size2 + " elements for second array -> ");
        for(int i=0; i<size2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Check elements of Array arr1 and arr2
        if (checkElementsOfArray(arr1, size1, arr2, size2)) {
            System.out.println("Elements in arr1 and arr2 are same.");
        } else {
            System.out.println("Elements in arr1 and arr2 are NOT same.");
        }
    }
}
