package Niuke;

import java.util.Random;

public class NC88FindKthLargest {
    //外循环用while,内循环是从left+1开始，不是从1开始。
    public int findKth(int[] a, int n, int K) {
        int left = 0;
        int right = n - 1;
        int target = n - K;
        int pos = 0;
        while (true){
            pos = randomPartition(a, left, right);
            if (pos == target) {
                return a[pos];
            } else if (pos < target) {
                left = ++pos;
            } else {
                right = --pos;
            }
        }
    }

    private int randomPartition(int[] a, int left, int right) {
        int randomPos = new Random().nextInt(right-left+1)+left;
        swap(a, left, randomPos);
        return partition(a, left, right);
    }


    private int partition(int[] a, int left, int right) {
        int pivot = a[left];
        int j =left;
        for (int i = left+1; i <=right ; i++) {
            if (a[i] < pivot) {
                j++;
                swap(a, i, j);
            }
        }
        swap(a,j,left);
        return j;
    }

    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
