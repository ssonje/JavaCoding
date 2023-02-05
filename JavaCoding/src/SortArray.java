import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        System.out.println("Array before sorting = `" + Arrays.toString(arr) + "`");

        // Sort array
        Arrays.sort(arr);
        System.out.println("Array after sorting = `" + Arrays.toString(arr) + "`");
    }

}
