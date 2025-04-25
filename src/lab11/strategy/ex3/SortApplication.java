package lab11.strategy.ex3;

import java.util.Scanner;

public class SortApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập mảng
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        // Chọn thuật toán
        System.out.println("Choose sorting method:");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Selection Sort");
        System.out.println("3 - Insertion Sort");
        int choice = scanner.nextInt();

        Sorter sorter;
        switch (choice) {
            case 1:
                sorter = new Sorter(new BubbleSortStrategy());
                break;
            case 2:
                sorter = new Sorter(new SelectionSortStrategy());
                break;
            case 3:
                sorter = new Sorter(new InsertionSortStrategy());
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Thực hiện sắp xếp
        sorter.sort(arr);

        // In kết quả
        System.out.println("Sorted array:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
