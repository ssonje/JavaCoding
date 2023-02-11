import java.util.ArrayList;
import java.util.List;

public class MergeLists {

    private static void mergeLists(List<Integer>list1, List<Integer>list2) {
        for (int i: list2) {
            list1.add(i);
        }

        System.out.println("Elements of Array List after merging list2 in list1 are as follows - ");
        for (int i: list1) {
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) {
        // Preparing List 1
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(30);
        list1.add(50);
        list1.add(70);
        list1.add(90);

        // Preparing List 2
        List<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(40);
        list2.add(60);
        list2.add(80);
        list2.add(100);

        // Merge lists
        mergeLists(list1, list2);
    }
}
