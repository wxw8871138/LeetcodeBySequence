package LeetCode;

import java.util.Arrays;

public class Q16ThreeSumCloset {
    //还是首尾双指针，res用已有的数据初始化，res更新的条件是Math.abs(target - sum) < Math.abs(target - res)
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < len; i++) {
            int left = i+1;
            int right = len - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(target - res)) {
                    res = sum;
                }
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return res;
                }
            }
        }
        return res;
    }
}
