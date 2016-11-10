package ru.eliseev.cormen;

import java.util.function.Function;

public class CountingSort {
    public static int[] sort(int[] a, int max){
        int[] c = new int[max+1];
        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;
        }
        for (int i = 1; i < c.length; i++) {
            c[i]+=c[i-1];
        }
        int[] r = new int[a.length];
        for (int i = a.length-1; i >=0 ; i--) {
            r[c[a[i]]-1]=a[i];
            c[a[i]]--;
        }
        return r;
    }

    public static int[] sort(int[] a, int max, Function<Integer,Integer> getValueFunction){
        int[] c = new int[max+1];
        for (int i = 0; i < a.length; i++) {
            c[getValueFunction.apply(a[i])]++;
        }
        for (int i = 1; i < c.length; i++) {
            c[i]+=c[i-1];
        }
        int[] r = new int[a.length];
        for (int i = a.length-1; i >=0 ; i--) {
            r[c[getValueFunction.apply(a[i])]-1]=a[i];
            c[getValueFunction.apply(a[i])]--;
        }
        return r;
    }
}
