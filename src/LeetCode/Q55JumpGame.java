package LeetCode;

public class Q55JumpGame {
    public boolean canJump(int[] nums) {
        int maxPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxPos < i) {
                return false;
            } else {
                maxPos = Math.max(maxPos, i + nums[i]);
            }
        }
        return true;
    }
}
