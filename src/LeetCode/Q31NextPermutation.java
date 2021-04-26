package LeetCode;

import java.util.Arrays;

public class Q31NextPermutation {
    //从尾到头双指针，遇到左指针比右指针小的情况，将左指针换为右边所有数中最小的那个，再让左边升序排序。
    public void nextPermutation(int[] nums) {
        int left = nums.length-2;
        while (left >= 0 && nums[left] >= nums[left + 1]) {
            left--;
        }
        if (left >= 0) {
            int right = nums.length-1;
            while (right >= 0 && nums[left] >= nums[right]) {
                right--;
            }
            swap(nums,left,right);
        }
        reverse(nums,left+1);

    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    private void reverse(int[] nums, int start) {
        int left = start;
        int right = nums.length-1;
        while (left < right) {
            swap(nums,left,right);
            left++;
            right--;
        }
    }

}
