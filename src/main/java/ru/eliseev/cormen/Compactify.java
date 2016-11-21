package ru.eliseev.cormen;

public class Compactify {
    public static int NULL = -1;

    public static void compactify(
            int[] key,
            int[] prev,
            int[] next,
            int head
    ) {
        int current = head;
        int place = 0;
        while (true) {
            if (current == NULL)
                break;

            int from = current;
            int to = place;
            int fromNext = next[from];
            int fromPrev = prev[from];
            int toNext = next[to];
            int toPrev = prev[to];
            int toKey = key[to];
            key[to] = key[from];
            key[from] = toKey;
            next[to] = next[from];
            prev[to] = prev[from];
            next[from] = toNext;
            prev[from] = toPrev;
            if (fromNext == to) {
                next[to] = from;
            }
            if (fromPrev == to) {
                prev[to] = from;
            }
            if (toNext == from) {
                next[from] = to;
            }
            if (toPrev == from) {
                prev[from] = to;
            }
            if (fromNext != NULL && fromNext != to) {
                prev[fromNext] = to;
            }
            if (fromPrev != NULL && fromPrev != to) {
                next[fromPrev] = to;
            }
            if (toPrev != NULL && toPrev != from) {
                next[toPrev] = from;
            }
            if (toNext != NULL && toNext != from) {
                prev[toNext] = from;
            }
            current = next[place];
            place++;
        }
    }
}
