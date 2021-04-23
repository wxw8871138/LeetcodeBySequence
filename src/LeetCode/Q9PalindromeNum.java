package LeetCode;

public class Q9PalindromeNum {
    //回文数，用%10的方式取最后一位
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNum = 0;
        while (x > revertedNum) {
            revertedNum = revertedNum * 10 + x % 10;
            x = x/10;
        }
        return x == revertedNum || x== revertedNum/10;
    }
}
