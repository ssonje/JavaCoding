package LeetCode;

import java.util.Arrays;
import java.util.Comparator;

public class PersonAttendsAllMeetings {

    private static boolean checkPersonCanAttendAllMeetings(int[][] arr) {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for (int i=0; i<arr.length-1; i++) {
            if (arr[i][1] > arr[i+1][0]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int size = 3;
        int[][] arr = {{4, 6}, {7, 10}, {10, 30}};

        if (checkPersonCanAttendAllMeetings(arr)) {
            System.out.println("Yes, person can attend all the events.");
        } else {
            System.out.println("No, person cannot attend all the events.");
        }
    }
}
