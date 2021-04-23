package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Q13RomanToInt {
    //先把基础字符存到map,然后从左到右优先检查2位的字符，再检查1位的字符
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int res = 0;
        int i = 0;
        while (i < s.length()) {
            if (i + 1 < s.length() && map.containsKey(s.substring(i, i + 2))) {
                res = res + map.get(s.substring(i, i + 2));
                i = i + 2;
            }else {
                res = res + map.get(s.substring(i, i + 1));
                i++;
            }
        }
        return res;

    }
}
