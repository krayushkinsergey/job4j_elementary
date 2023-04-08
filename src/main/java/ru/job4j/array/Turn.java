package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int iterations = array.length / 2;
        int begin = 0;
        int end = array.length - 1;
        for (int i = 1; i <= iterations; i++) {
            int temp = array[begin];
            array[begin] = array[end];
            array[end] = temp;
            begin++;
            end--;
        }
        return array;
    }
}
