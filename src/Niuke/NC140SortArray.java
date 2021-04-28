package Niuke;

import java.util.Random;

public class NC140SortArray {
    public int[] MySort (int[] arr) {
        randomizedQuicksort(arr, 0, arr.length - 1);
        return arr;
    }

    private void randomizedQuicksort(int[] arr, int l, int r) {
        if (l < r) {
            int pos = randomizedPartition(arr, l, r);
            randomizedQuicksort(arr, l, pos - 1);
            randomizedQuicksort(arr, pos + 1, r);
        }
    }

    private int randomizedPartition(int[] arr, int l, int r) {
        int i = new Random().nextInt(r - l + 1) + l;
        swap(arr, l, i);
        return partition(arr,l,r);
    }

    private int partition(int[] arr, int l, int r) {
        int pivot = arr[l];
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (arr[i] < pivot) {
                j++;
                swap(arr,i,j);
            }
        }
        swap(arr, l, j);
        return j;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
