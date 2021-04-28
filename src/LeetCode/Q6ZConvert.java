package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Q6ZConvert {
    //每一行都建立一个集合，按从前到后再从后到前的顺序放入各个集合中，用一个flag=-1/1来表示方向。
    //每一行new一个StringBuilder,放进集合里，方便调用
    public String convert(String s, int numRows) {
        if (numRows<2) return s;
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        int flag = -1;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            rows.get(i).append(s.charAt(j));
            if (i==0||i==numRows-1) flag = -flag;
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row:
             rows) {
            res.append(row);
        }
        return res.toString();
    }

    public static void main(String[] args) {

    }
}
