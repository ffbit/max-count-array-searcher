package com.ffbit.array;

public class CountInfo {
    private final int value;
    private int count;

    public CountInfo(int value, int count) {
        this.value = value;
        this.count = count;
    }

    public int getValue() {
        return value;
    }

    public int getCount() {
        return count;
    }
    
    public void incrementCount() {
        count++;
    }

    public CountInfo max(CountInfo other) {
        if (count < other.count) {
            return other;
        }
        
        return this;
    }
    
}
