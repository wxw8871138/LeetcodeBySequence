package LeetCode2;

import java.util.ArrayList;
import java.util.List;

public class Q6ZConvert {
    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            list.add(stringBuilder);
        }
        int flag = -1;
        int i = 0;
        for (char c : s.toCharArray()
        ) {
            list.get(i).append(c);
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (int j = 0; j < list.size(); j++) {
            res.append(list.get(j));
        }
        return res.toString();
    }
}
