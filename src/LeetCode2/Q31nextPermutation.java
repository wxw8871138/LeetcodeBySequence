package LeetCode2;

import java.util.Arrays;

public class Q31nextPermutation {
    //从尾向前遍历，找到第一个左比右小的数
    //升序排序此数之后的所有数
    //从此数开始向右遍历，找到第一个比此数大的数，交换位置
    //至此如果存在此数，就找到了nextPermutation
    //如果找不到，在结尾直接升序排列然后返回。
    public static void nextPermutation(int[] nums) {
        int len = nums.length;
        for (int i = len - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                Arrays.sort(nums, i, len);
            }
            for (int j = i; j < len; j++) {
                if (nums[j] > nums[i - 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[i - 1];
                    nums[i - 1] = tmp;
                    return;
                }
            }
        }
        Arrays.sort(nums);
        return;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 8, 5, 7, 6, 4};
        nextPermutation(nums);
    }
}
