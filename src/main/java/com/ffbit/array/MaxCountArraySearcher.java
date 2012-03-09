package com.ffbit.array;

import java.util.Arrays;

public class MaxCountArraySearcher {
    private int[] src;

    public MaxCountArraySearcher(int[] src) {
        this.src = src.clone();
    }

    public CountInfo search() {
        sort();
        
        CountInfo current = new CountInfo(0, 0);
        CountInfo previous = current;

        for (int i : src) {
            if (i == current.getValue()) {
                current.incrementCount();
            } else {
                previous = previous.max(current);
                current = new CountInfo(i, 1);
            }
        }
        
        return previous.max(current);
    }

    private void sort() {
        Arrays.sort(src);
    }

}
