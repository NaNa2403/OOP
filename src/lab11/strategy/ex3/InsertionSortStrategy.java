package lab11.strategy.ex3;

public class InsertionSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] arr) {
        System.out.println("Using Insertion Sort...");
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
