package ru.eliseev.cormen;

public class QuickSort {
    public static int [] sort(int[] array){
        quicksort(array, 0, array.length -1);
        return array;
    }

    private static int partition(int[] array, int q, int p) {
        int x = array[p];
        int i = q - 1;
        int j = p;

        int k = q;
        while(true){
            if(j-i==1){
                break;
            }
            if(array[k] <= x){
                i++;
                k++;
            }else{
                j--;
                swap(array, k, j);
            }
        }
        swap(array,j,p);
        return j;
    }

    private static int partition1(int[] array, int q, int p) {
        int x = array[p];
        int i = q - 1;
        for(int j = q; j < p; j++){
            if(array[j]<=x){
                i++;
                swap(array,j,i);
            }
        }
        swap(array,i+1,p);
        return i+1;
    }

    private static void swap(int[] array, int i, int j){
        int swap = array[i];
        array[i] = array[j];
        array[j] = swap;
    }

    public static void quicksort(int[] array,int q, int p){
        if(q>=p){
            return;
        }
        int partition = partition1(array, q, p);
        quicksort(array,q,partition-1);
        quicksort(array, partition+1,p);
    }
}
