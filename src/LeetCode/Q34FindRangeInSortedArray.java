package LeetCode;

public class Q34FindRangeInSortedArray {
    //先用二分查找找到target所在的位置，然后中心扩散求出数组
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
            if (nums[mid] == target) break;
            if (nums[mid]<target){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        int left = mid;
        int right = mid;
        if (nums[mid] == target){
            while (left >= 1 && nums[left - 1] == target) {
                left--;
            }
            while (right <= nums.length-2 && nums[right + 1] == target) {
                right++;
            }
            res[0] = left;
            res[1] = right;
        }
        return res;
    }
}
