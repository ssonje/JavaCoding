public class MergeSort {

    private static void merge(int[] arr, int size, int start, int mid, int end) {
        int i = start, j = mid + 1, k = 0;
        int tempArray[] = new int[end - start + 1];

        while(i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                tempArray[k] = arr[i];
                k++;
                i++;
            } else {
                tempArray[k] = arr[j];
                k++;
                j++;
            }
        }

        while(i <= mid) {
            tempArray[k] = arr[i];
            k++;
            i++;
        }

        while(j <= end) {
            tempArray[k] = arr[j];
            k++;
            j++;
        }

        k = 0;
        for(int index = start; index <= end; index++) {
            arr[index] = tempArray[k++];
        }
    }

    private static void mergeSort(int[] arr, int size, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, size, start, mid);
            mergeSort(arr, size, mid + 1, end);
            merge(arr, size, start, mid, end);
        }
    }

    public static void main(String[] args) {
        // Create sample array to sort
        int arr[] = {5,1,4,2,3};
        int size = arr.length;
        int start = 0;
        int end = size - 1;

        // Printing elements before sorting
        System.out.println("Elements in the array before sorting are as follows ->");
        for(int i: arr) {
            System.out.print(i + ", ");
        }

        System.out.println();

        // Merge sort algorithm
        mergeSort(arr, size, start, end);

        // Printing elements after sorting
        System.out.println("Elements in the array after sorting are as follows ->");
        for(int i: arr) {
            System.out.print(i + ", ");
        }

        System.out.println();
    }
}
