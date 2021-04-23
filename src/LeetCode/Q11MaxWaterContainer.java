package LeetCode;

public class Q11MaxWaterContainer {
    public int maxArea(int[] height) {
        int res = 0;
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j < height.length; j++) {
                int h = height[i]>=height[j]?height[j]:height[i];
                res = Math.max(res, h*(j-i+1));
            }
        }
        return res;
    }

    //双指针，从两边向中间滑动
    public int maxArea_On(int[] height) {
        int left = 0;
        int right = height.length-1;
        int res = 0;
        while (left < right) {
            if (height[left] <= height[right]) {
                res = Math.max(res,height[left]*(right-left));
                left++;
            }else {
                res = Math.max(res,height[right]*(right-left));
                right--;
            }
        }
        return res;
    }
}
