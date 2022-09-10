package com.bridgelabz;

public class PrintEvenPosition {
    public static void main(String[] args) {
        int array[] = {5, 2, 3, 10, 5, 6, 7};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
