public class BinarySearch {

    private static boolean binarySearch(int[] arr, int targetElement, int start, int end) {
        // Base case
        if (start >= end) {
            return false;
        }

        // Actual logic
        int mid = start + (end - start) / 2;

        if (arr[mid] == targetElement) {
            return true;
        }

        if (arr[mid] < targetElement) {
            return binarySearch(arr, targetElement, mid + 1, end);
        }

        if (arr[mid] > targetElement) {
            return binarySearch(arr, targetElement, start, mid - 1);
        }

        return false;
    }

    public static void main(String[] args) {
        // Input array
        int arr[] = {1,3,5,7,9};
        int targetElement = 7;
        int start = 0;
        int end = arr.length - 1;

        // Binary search algorithm
        if (binarySearch(arr, targetElement, start, end)) {
            System.out.println("Target element `" + targetElement + "` is found in the array.");
        } else {
            System.out.println("Target element `" + targetElement + "` is not found in the array.");
        }

    }

}
