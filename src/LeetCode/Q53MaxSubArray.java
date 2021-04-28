package LeetCode;

import java.util.Arrays;

public class Q53MaxSubArray {
    //有滑窗的感觉，但不需要用左右指针
    //用sum记录当前连续子数组的值，如果这个值大于0，那sum就更新为当前值加sum。
    //如果这个值小于0，说明到目前为止的子数组对后面是副作用，就直接丢掉，子数组从当前位置开始。
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum > 0) {
                sum = sum + nums[i];
            } else {
                sum = nums[i];
            }
            res = Math.max(res,sum);
        }
        res = Math.max(res, sum);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Arrays.stream(nums).forEach(num-> System.out.println(num));
        System.out.println(maxSubArray(nums));
    }
}
