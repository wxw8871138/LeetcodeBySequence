package Jianzhi;

import java.util.Arrays;
import java.util.Comparator;

public class Q45SortArrayToSmallestNum {
    public String minNumber(int[] nums) {
        Integer[] integers = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            integers[i] = nums[i];
        }
        Arrays.sort(integers, (i1, i2) -> (i1.toString() + i2.toString()).compareTo(i2.toString() + i1.toString()));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < integers.length; i++) {
            stringBuilder.append(integers[i].toString());
        }
        return stringBuilder.toString();
    }
}
