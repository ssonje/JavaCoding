package JavaPracticeCodingQuestions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueElementsFromArray {

    public static void main(String[] args) {
        int[] arr = new int[] {1,1,2,2,3,4,5,3,2,1};
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            set.add(arr[i]);
        }

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
