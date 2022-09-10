package com.bridgelabz;

public class AscendingOrderToPrint {
    public static void main(String[] args) {
        int temp = 0;
        System.out.println("Original Array");
        int array[] = {5, 2, 3, 10, 5, 6, 7};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("sorted array");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}