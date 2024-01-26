import java.util.*;
import java.io.*;

public class Quick {
    public static int partition(int arr[], int l, int h) {
        int pivot = arr[l];
        int i = l;
        for (int j = l + 1; j <= h; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;
        
        return i;


    }

    public static void quicksort(int arr[], int l, int h) {
        if (l < h) {
            int m = partition(arr, l, h);
            quicksort(arr, l, m - 1);
            quicksort(arr, m + 1, h);
        }
    }

    public static void printarr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 8, 3, 6, 9, 4 };
        int n = arr.length;

        System.out.println("Array before sorting is ");
        printarr(arr, n);

        quicksort(arr, 0, n - 1);
        System.out.println("Array after sorting is ");
        printarr(arr, n);
    }
}
