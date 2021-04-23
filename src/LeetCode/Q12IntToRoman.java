package LeetCode;

public class Q12IntToRoman {
    //贪心算法，先找出所有基本字符，优先使用大的符号
    public String intToRoman(int num) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        while (index < 13) {
            while (num >= nums[index]) {
                stringBuilder.append(romans[index]);
                num = num - nums[index];
            }
            index++;
        }
        return stringBuilder.toString();
    }
}
