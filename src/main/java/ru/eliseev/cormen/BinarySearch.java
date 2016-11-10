package ru.eliseev.cormen;

public class BinarySearch {
    public static int find(int[] a, int what) {
        if (a.length == 0) return -1;
        int l = 0;
        int r = a.length - 1;
        for (; ; ) {
            int med = (l + r) / 2;
            if (a[med] == what) {
                return med;
            }
            if (l >= r) return -1;

            if (a[med] > what) {
                r = med;
                continue;
            }
            l = med + 1;
        }
    }
}

