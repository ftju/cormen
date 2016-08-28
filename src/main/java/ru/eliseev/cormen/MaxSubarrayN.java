package ru.eliseev.cormen;

import java.util.Objects;

/**
 * Created by sergey on 28.08.16.
 */
public class MaxSubarrayN {
    public static SumIndexed find(long[] a){
        SumIndexed lbs = new SumIndexed(a[0],0,0);
        SumIndexed max = new SumIndexed(a[0],0,0);
        for (int i=1; i< a.length; i++){
            if(lbs.getSum() + a[i] > a[i]){
                lbs = new SumIndexed(lbs.getSum()+a[i],lbs.getLeft(),i);
            }else{
                lbs = new SumIndexed(a[i],i,i);
            }

            if (lbs.getSum() > max.getSum()) {
                max = lbs.clone();
            }
        }
        return max;
    }

    public static class SumIndexed implements Cloneable{
        private final long sum;
        private final int left;
        private final int right;

        public SumIndexed(long sum, int left, int right) {
            this.sum = sum;
            this.left = left;
            this.right = right;
        }

        public long getSum() {
            return sum;
        }

        public int getLeft() {
            return left;
        }

        public int getRight() {
            return right;
        }

        public SumIndexed clone(){
            return new SumIndexed(sum,left,right);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SumIndexed that = (SumIndexed) o;
            return sum == that.sum &&
                    left == that.left &&
                    right == that.right;
        }

        @Override
        public int hashCode() {
            return Objects.hash(sum, left, right);
        }

        @Override
        public String toString() {
            return "SumIndexed{" +
                    "sum=" + sum +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

}
