import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ZebraInterviewQuestion {

    public static void main(String[] args) {
        // Take input from user
        int size = 5;
        int arr[] = new int[size];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 elements -> ");
        for(int i=0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();

        // If the number is repeated then stored that number into arrayList else in hashset.
        for (int i=0; i<size; i++) {
            if (hashSet.contains(arr[i])) {
                arrayList.add(arr[i]);
            } else {
                hashSet.add(arr[i]);
            }
        }

        // Printing hashSet and arrayList
        System.out.println("Elements in the hash set are as follows -> ");
        Iterator hashSetIterator = hashSet.iterator();
        while (hashSetIterator.hasNext()) {
            System.out.print(hashSetIterator.next() + ", ");
        }

        System.out.println();

        System.out.println("Elements in the array list are as follows -> ");
        Iterator arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            System.out.print(arrayListIterator.next() + ", ");
        }

        System.out.println();
    }
}
