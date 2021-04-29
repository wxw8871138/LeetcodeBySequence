package LeetCode;

public class Q69MySqrt {
    //二分查找
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int left = 1;
        int right = x/2;
        while (left < right) {
            int mid = left + (right-left+1)/2;
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return left;
    }
}
