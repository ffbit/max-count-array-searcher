package com.ffbit.array;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;


public class CountInfoTest {

    @Test
    public void itShouldIncrementCount() {
        int count = 1;
        CountInfo info = new CountInfo(0, count);
        
        info.incrementCount();
        assertEquals(count + 1, info.getCount());
    }
    
    @Test
    public void itShouldDetermineMax() {
        CountInfo x = new CountInfo(1, 1);
        CountInfo y = new CountInfo(2, 3);
        
        assertSame(y, x.max(y));
    }

}
