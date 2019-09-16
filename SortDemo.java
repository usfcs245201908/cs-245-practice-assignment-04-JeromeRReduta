import java.util.*;

public class SortDemo {
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        InsertionSort i = new InsertionSort();
        SelectionSort s = new SelectionSort();

        int[] a = {5, 7, 6, 1, 2, 3, 4, 10};

        i.sort(a);

        System.out.println(Arrays.toString(a));



    }
}
