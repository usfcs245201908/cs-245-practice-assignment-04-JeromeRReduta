import java.lang.*;
import java.util.Arrays;

public class BubbleSort implements SortingAlgorithm {
    public BubbleSort() {}

    public void sort(int[] a) {

        boolean notDone = true;

        while (notDone) {
            notDone = false;

            for (int i = 0; i < a.length -1; i++) {
                if (a[i] > a[i + 1]) {
                    Swap.swap(a, i, i + 1);
                    notDone = true;
                }
            }


        }

    }

}
