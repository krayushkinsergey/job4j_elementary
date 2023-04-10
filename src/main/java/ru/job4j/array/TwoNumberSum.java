package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int begin = 0;
        int end = array.length - 1;
        while (begin < end) {
            int sum = array[begin] + array[end];
            if (sum == target) {
                return new int[] {begin, end};
            } else if (sum < target) {
                begin++;
            } else {
                end--;
            }
        }
        return new int[0];
    }
}
