package com.bridgelabz;

public class DuplicateElementPrint {
    public static void main(String[] args) {
        int array[] = {5, 2, 3, 10, 5, 6, 7,6};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
                    System.out.println(array[j]);
                }
            }
        }
    }
}