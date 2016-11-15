package ru.eliseev.cormen;

import java.util.List;

public class InsertionSort {
    public static void sort(List<Integer> list){
        for (int j = 1; j < list.size(); j++){
            for(int i = j-1; i >=0; i --){
                if(list.get(i+1) < list.get(i) ){
                    int a = list.get(i+1);
                    list.set(i+1,list.get(i));
                    list.set(i,a);
                }else{
                    break;
                }
            }
        }
    }

    public static void sort(int[] a, int l, int r) {
        for (int i = l ; i <= r; i++) {
            for (int j = i-1; j >= l; j--) {
                if(a[j+1]<a[j]){
                    int swap = a[j+1];
                    a[j+1] = a[j];
                    a[j] = swap;
                }else{
                    break;
                }
            }
        }
    }
}
