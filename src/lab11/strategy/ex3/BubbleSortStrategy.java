package lab11.strategy.ex3;

public class BubbleSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] arr) {
        System.out.println("Using Bubble Sort...");
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
