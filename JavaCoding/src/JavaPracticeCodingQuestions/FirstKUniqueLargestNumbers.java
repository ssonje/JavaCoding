package JavaPracticeCodingQuestions;

import java.util.*;

public class FirstKUniqueLargestNumbers {

    public static void main(String[] args) {
        int[] arr = {11, 5, 12, 9, 44, 44, 17, 170, 2};
        int k = 2;

        Arrays.sort(arr);

        int count = 0;
        for (int i=arr.length-1; i>=0; i--) {
            if (count < k) {
                if (arr[i] == arr[i - 1]) {
                    continue;
                } else {
                    System.out.println(arr[i]);
                    count++;
                }
            } else {
                break;
            }
        }
    }
}
