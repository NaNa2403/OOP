package lab3;

import java.util.Arrays;

public class Ex2 {
    public static boolean linearSearch(int [] array , int key){
        for (int j : array) {
            if (j == key) return true;
        }
        return false;
    }
    public static int linearSearchIndex(int[] array, int key){
        for (int i = 0 ; i < array.length; i++){
            if (array[i] == key) return i;
        }
        return -1;
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx){
        if (fromIdx == toIdx - 1){
            return key == array[fromIdx];
        }
        else if (key > array[toIdx] || key < array[fromIdx]) return false;
        else {
            int middleIdx = (fromIdx + toIdx)/2;
            if (key == array[middleIdx]) return true;
            else if (key < array[middleIdx]) {
                toIdx = middleIdx;
            }
            else  {
                fromIdx = middleIdx + 1;
            }
            return binarySearch(array, key, fromIdx, toIdx);

            }
        }

    public static void bubbleSort(int[] array){
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1 ; i< n; i++){
                if (array[i-1] > array[i]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);
    }

    public static void selectionSort(int[] array){
        for (int i = 0 ; i<array.length -1; i++){
            int min = i;
            for (int j = i +1 ; j < array.length; j++){
                if (array[j] < array[min]){
                    min = j;
                }

            }
            if (min != array[i]){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }

    public static void insertionSort(int[] array){
        for (int i = 1; i< array.length; i++){
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j--;
            }

            array[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {3,4,5,6,7,8};
        int key = 8;
        System.out.printf("Linear Search : %s\n", linearSearch(array, key)? "Key in array": "Key not found");
        System.out.printf("Key is index : %s\n", linearSearchIndex(array, key));
        System.out.printf("Binary Search : %s\n", binarySearch(array, key, 0, array.length - 1)? "Key in array": "Key not found");

        int[] bubbleArray = {1,5,7,16,8,3,4,2};
        System.out.println("before bubble sort : "+ Arrays.toString(bubbleArray));
        bubbleSort(bubbleArray);
        System.out.println("after bubble sort : "+ Arrays.toString(bubbleArray));

        int[] selectionArray = {1,5,7,16,8,3,4,2};
        System.out.println("before selection sort : " + Arrays.toString(bubbleArray));
        selectionSort(selectionArray);
        System.out.println("before selection sort : " + Arrays.toString(selectionArray));

        int[] insertionArray = {1,5,7,16,8,3,4,2};
        System.out.println("before insertion sort : "+ Arrays.toString(insertionArray));
        insertionSort(insertionArray);
        System.out.println("before insertion sort : " + Arrays.toString(insertionArray));

    }
}
