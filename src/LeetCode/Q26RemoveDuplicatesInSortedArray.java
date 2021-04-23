package LeetCode;

public class Q26RemoveDuplicatesInSortedArray {
    //快慢双指针，当快慢指针的数不相等时，将快指针的数放到慢指针之后，并让慢指针指向更新的数。
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return len;
        }
        int left = 0;
        for (int right = 1; right < len; right++) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
            }
        }
        return left+1;
    }
}
