package com.bridgelabz;

public class ReversArrayPrint {
    public static void main(String[] args) {
        int array[] = {5, 2, 3, 10, 5, 6, 7};
        for (int i = array.length - 1;i >= 0;i--){
            System.out.println(array[i]);
        }
    }
}
