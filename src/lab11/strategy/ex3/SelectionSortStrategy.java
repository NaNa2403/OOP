package lab11.strategy.ex3;

public class SelectionSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] arr) {
        System.out.println("Using Selection Sort...");
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
