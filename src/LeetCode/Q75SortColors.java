package LeetCode;

public class Q75SortColors {
    //快排分治partition的思想，把0放左边，2放右边，注意遍历的时候如果遇到2，要while循环判断换了一个是不是还是2.
    public void sortColors(int[] nums) {
        int left_j = 0;
        int right_j = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            while (i <= right_j && nums[i] == 2) {
                swap(nums,i,right_j);
                right_j--;
            }
            if (nums[i] == 0) {
                swap(nums, i, left_j);
                left_j++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
