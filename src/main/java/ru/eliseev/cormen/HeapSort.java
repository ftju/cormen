package ru.eliseev.cormen;

public class HeapSort {
    public static int[] sort(int[] array){
        if(array ==  null) {
            return array;
        }
        Heap heap = new Heap(array);
        int[] result = new int[array.length];
        for(int i = array.length-1; i>= 0; i--){
            result[i]=heap.getTop();
            heap.putTop(heap.deleteLast());
        }
        return result;
    }

    private static class Heap{
        int [] backedArray;
        int heapSize;

        public Heap(int[] backedArray) {
            this.backedArray = backedArray;
            this.heapSize = backedArray.length;
            buildHeapInPlace();
        }

        private void buildHeapInPlace() {
            for(int i = backedArray.length/2; i >= 0; i --){
                sieveDown(i);
            }
        }

         void sieveDown( int index){
             while (true){
                 int element = backedArray[index];
                 int leftChildIndex = ((index+1)<<1) - 1 ;
                 int rightChildIndex = ((index+1)<<1) ;
                 if(leftChildIndex < heapSize && rightChildIndex < heapSize){
                     int left = backedArray[leftChildIndex];
                     int right = backedArray[rightChildIndex];
                     if(left <= element && right <= element){
                         return;
                     }
                     if(left>=right){
                         backedArray[index] = left;
                         backedArray[leftChildIndex]=element;
                         index=leftChildIndex;
                         continue;
                     }
                     backedArray[index] = right;
                     backedArray[rightChildIndex]=element;
                     index=rightChildIndex;
                     continue;
                 }
                 if (leftChildIndex < heapSize){
                     int left = backedArray[leftChildIndex];
                     if(left <= element ){
                         return;
                     }
                     backedArray[index] = left;
                     backedArray[leftChildIndex]=element;
                     index=leftChildIndex;
                     continue;
                 }
                 return;
             }
         }

        int getTop(){
            assertNotEmpty();
            return backedArray[0];
        }

        void putTop(int element){
            backedArray[0] = element;
            sieveDown(0);
        }

        int deleteLast(){
            assertNotEmpty();
            heapSize--;
            return backedArray[heapSize];
        }

        private void assertNotEmpty(){
            if(heapSize==0){
                throw new IllegalArgumentException();
            }
        }
    }
}
