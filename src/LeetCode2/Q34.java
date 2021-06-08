package LeetCode2;

public class Q34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        if (nums == null || nums.length == 0) {
            return res;
        }
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                break;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (nums[mid] == target) {
            int left = mid;
            int right = mid;
            while (left >= 1 && nums[left - 1] == target) {
                left--;
            }
            while (right <= nums.length - 2 && nums[right + 1] == target) {
                right++;
            }
            res[0] = left;
            res[1] = right;
        }
        return res;
    }
}
