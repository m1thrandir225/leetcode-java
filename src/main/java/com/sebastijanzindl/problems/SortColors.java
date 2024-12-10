package com.sebastijanzindl.problems;

public class SortColors {
    public static int[] sortColors(int[] colors) {
        int i = 0, j = 0, k = colors.length - 1;
        while (j < k) {
            if (colors[j] == 0) {
                swap(colors, i, j);
                i++;
                j++;
            } else if (colors[j] == 1) {
                j++;
            } else {
                swap(colors, j, k);
                k--;
            }
        }
        return colors;
    }

    private static void swap(int[] colors, int i, int j) {
        int temp = colors[i];
        colors[i] = colors[j];
        colors[j] = temp;
    }
}

