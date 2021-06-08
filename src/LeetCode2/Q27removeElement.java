package LeetCode2;

public class Q27removeElement {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] != val) {
                nums[left] = nums[r];
                left++;
            }
        }
        return left+1;
    }
}
