package LeetCode2;

public class Q55canJump {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max >= i) {
                max = Math.max(max, i + nums[i]);
            }
        }
        return max >= nums.length - 1;
    }
}
