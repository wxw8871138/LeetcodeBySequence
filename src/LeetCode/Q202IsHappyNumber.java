package LeetCode;

public class Q202IsHappyNumber {
    //快慢指针，fast变两次，slow变一次，相遇时如果等于1就是快乐数，不等于1就不是
    public boolean isHappy(int n) {
        int slow = n;
        int fast = squareSum(n);
        while (slow != fast) {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        }
        return slow == 1;
    }

    private int squareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;

    }
}
