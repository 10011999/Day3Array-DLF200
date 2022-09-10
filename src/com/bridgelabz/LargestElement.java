package com.bridgelabz;

public class LargestElement {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 10, 5, 6, 7};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println(max);
    }
}
