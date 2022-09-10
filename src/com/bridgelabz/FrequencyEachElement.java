package com.bridgelabz;

public class FrequencyEachElement {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 2, 1};
        int freq[] = new int[array.length];
        int v = -1;
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]){
                    count++;
                    freq[j] = v;
            }
        }
            if (freq[i] != v)
                freq[i] = count;
    }
        System.out.println("Element|Frequency");
        for (int i = 0;i < freq.length; i++){
            if (freq[i] != v)
                System.out.println(" "+array[i]+" | "+freq[i]);
        }
}
}