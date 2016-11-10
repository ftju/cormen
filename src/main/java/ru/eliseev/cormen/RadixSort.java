package ru.eliseev.cormen;

public class RadixSort {

    public static int[] sort(int[] a){
        for (int i = 0; i < 10; i++) {
            a = stableSort(a,i);
        }
        return a;
    }

    private static int[] stableSort(int[] a, int i) {
        return CountingSort.sort(a, 10, (n)-> getNDigit(i,n));
    }

    //digits positions start from 0
    public static int getNDigit(int n, int val){
        for(int i = 0; i < n; i++){
            val = val/10;
        }
        return val%10;
    }
}
