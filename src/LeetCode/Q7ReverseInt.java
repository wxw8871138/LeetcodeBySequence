package LeetCode;

public class Q7ReverseInt {
    //用x%10取得最后一位，再用res*10+最后一位得到反转的数
    //边界判断
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int tmp = x % 10;
            //判断是否大于最大32位整数
            if (res > 214748364 || (res == 214748364) && tmp > 7) {
                return 0;
            }
            //判断是否小于最小32位整数
            if (res < -214748364 || (res == -214748364 && tmp < -8)) {
                return 0;
            }
            res = res * 10 + tmp;
            x /= 10;
        }
        return res;
    }
}
