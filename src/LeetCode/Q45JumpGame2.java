package LeetCode;

public class Q45JumpGame2 {
    //贪心算法，每次起跳前记录每个点起跳最远能到多远，到需要起跳的时候直接去能跳到最远的那个点，然后重复
    public int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;

    }
}
