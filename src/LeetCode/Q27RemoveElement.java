package LeetCode;

public class Q27RemoveElement {
    //快慢指针，依次将不等于val的值放入慢指针，同时慢指针+1
    public int removeElement(int[] nums, int val) {
        if (nums.length==0){
            return 0;
        }
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right]!=val){
                nums[left]=nums[right];
                left++;
            }
        }
        return left;
    }



}
