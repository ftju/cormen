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
}
