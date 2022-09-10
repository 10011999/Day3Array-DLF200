package com.bridgelabz;

public class SecondLargest {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 5, 5, 9, 10};
        int smax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > smax )
                smax = array[i] - 1;
        }
        System.out.println(smax);
    }
}
