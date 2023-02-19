import java.util.Scanner;

public class SecondLargestNumberInArray {

    private static int findSecondLargestElement(int arr[], int size) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<size; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[];
        Scanner scanner = new Scanner(System.in);

        // Get input array from user
        System.out.print("Enter size of array -> ");
        int size = scanner.nextInt();
        arr = new int[size];

        System.out.print("Enter " + size + " elements for array -> ");
        for(int i=0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Second largest element in the Array = " + findSecondLargestElement(arr, arr.length));
    }

}
