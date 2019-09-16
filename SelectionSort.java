public class SelectionSort implements SortingAlgorithm {
    public SelectionSort() {}

    public void sort(int[] a) {
        for (int i = 0; i < a.length; i++)
            Swap.swap(a, i, findMin(a, i));
    }

    private int findMin(int[] a, int start){
        int min = start;
        for (int i = start+1; i < a.length; i++) {
            if (a[i] < a[min])
                min = i;
        }

        return min;

    }
}
