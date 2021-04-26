package LeetCode;

public class Q41FirstMissingPositive {
    //原地哈希，利用数组的下标表示每个数应该在的位置。比如Nums[0]就应该是1，Nums[5]应该是6，第一个不在位置的数就是缺的数。
    //循环将i下标的数移到nums[i-1]下标去
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            while (nums[i] > 0 && nums[i] <= len && nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {
                swap(nums,nums[i]-1,i);
            }
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] != i + 1) {
                return i+1;
            }
        }
        return len+1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
