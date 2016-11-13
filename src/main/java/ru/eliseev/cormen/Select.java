package ru.eliseev.cormen;

public class Select {
    public static int selectNLogN(int[] a, int i) {
        int l = 0;
        int r = a.length - 1;
        while (true) {
            int p = partition(a, l, r);
            if (p == i) return a[p];
            if (p > i) {
                r = p-1;
                continue;
            }
            l = p+1;
        }
    }

    private static int partition(int[] a, int l, int r) {
        int pivot = a[r];

        int i = l;
        for (int k = l; k < r; k++) {
            if (a[k] > pivot) {
                continue;
            }
            int swap = a[k];
            a[k] = a[i];
            a[i] = swap;
            i++;
        }
        a[r] = a[i];
        a[i] = pivot;
        return i;
    }
}
