package ru.eliseev.cormen;

public class QuickSort {
    public static int [] sort(int[] array){
        quicksort(array, 0, array.length -1);
        return array;
    }

    private static int partition(int[] array, int q, int p){
        int x = array[p];
        int i = q-1;
        int j = p-1;
        for (int k = q;k<=p-1;k++){
            if (array[k] < x){
                i++;
            }else{
                int swap = array[k];
                array[k] = array[j];
                array[j]=swap;
                j--;
            }
        }
        int swap = array[p];
        array[p]=array[j];
        array[j]=swap;
        return j;
    }

    public static void quicksort(int[] array,int q, int p){
        if(q==p){
            return;
        }
        int partition = partition(array, q, p);
        quicksort(array,q,partition-1);
        quicksort(array, partition+1,p);
    }
}
