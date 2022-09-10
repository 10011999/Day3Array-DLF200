package com.bridgelabz;

public class SmallestElement {
    public static void main(String[] args) {
        int array[] = {5, 2, 3, 10, 5, 6, 7};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);
    }
}
