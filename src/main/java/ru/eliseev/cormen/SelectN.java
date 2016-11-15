package ru.eliseev.cormen;

public class SelectN {
    private static final int CHUNK_SIZE = 5;

    public static int selectN(int[] a, int l, int r, int i) {
        while (true) {
            int med = getMed(a, l, r, CHUNK_SIZE);
            int indexOfValue = partitionWithValue(a, l, r, med);
            if (indexOfValue == i) return med;
            if (indexOfValue > i) {
                r = indexOfValue - 1;
                continue;
            }
            l = indexOfValue + 1;
        }
    }

    private static int getMed(int[] a, int l, int r, int chunkSize) {
        sortByChunks(a, l, r, chunkSize);
        if (r - l < chunkSize) {
            return a[l + ((r - l) / 2)];
        }
        int[] newA = getArrayFromMed(a, l, r, chunkSize);
        return selectN(newA, 0, newA.length - 1, Math.min(newA.length / 2, newA.length - 1));
    }

    private static int partitionWithValue(int[] a, int l, int r, int med) {
        int i = l;
        for (int j = l; j <= r; j++) {
            if (a[j] > med) {
                continue;
            }
            int swap = a[j];
            a[j] = a[i];
            a[i] = swap;
            i++;
        }
        return i - 1;
    }

    private static int[] getArrayFromMed(int[] a, int l, int r, int chunkSize) {
        int b = 0;
        int medIndex = chunkSize / 2;
        int[] newA = new int[(r - l + 1) / chunkSize];
        for (int i = medIndex;i <= r && b<=newA.length-1; i += chunkSize) {
            newA[b] = a[i];
            b++;
        }
        return newA;
    }

    private static void sortByChunks(int[] a, int l, int r, int chunkSize) {
        for (int i = l; i <= r; i += chunkSize) {
            InsertionSort.sort(a, i, Math.min(r, i + chunkSize - 1));
        }
    }
}
