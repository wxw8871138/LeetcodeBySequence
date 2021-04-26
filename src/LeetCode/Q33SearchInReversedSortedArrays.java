package LeetCode;

public class Q33SearchInReversedSortedArrays {
    //排序数组查找优先考虑二分查找，本题通过比较nums[mid]和nums[low]能得出mid在左段还是右段。
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] >= nums[low]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < nums[low]) {
                    if (target >= nums[mid] && target < nums[high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }
        }
        return -1;
    }
}
