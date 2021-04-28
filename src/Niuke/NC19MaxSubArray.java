package Niuke;

public class NC19MaxSubArray {
    public static int maxsumofSubarray (int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int maxSum = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (sum > 0) {
                sum = sum + arr[i];
            } else {
                sum = arr[i];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 5, -2, 6, -1};
        System.out.println(maxsumofSubarray(arr));
    }
}
