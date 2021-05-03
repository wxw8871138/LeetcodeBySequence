package Jianzhi;

public class Q39MajorityElement {
    public int majorityElement(int[] nums) {
        int num = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (res == 0 || num==nums[i]) {
                num = nums[i];
                res++;
            } else {
                res--;
            }
        }
        return num;
    }
}
