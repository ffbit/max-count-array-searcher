package com.ffbit.array;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MaxCountArraySearcherTest {
    private int expectedValue;
    private int expectedCount;
    private int[] src;
    private MaxCountArraySearcher searcher;

    @Parameters
    public static Collection<Object[]> init() {
        Object[][] parameters = {
                { 1, 3, new int[] { 1, 2, 3, 1, 2, 1, 4 } },
                { 1, 3, new int[] { 1, 2, 3, 1, 2, 1, 2 } },
                { 5, 4, new int[] { 5, 5, 5, 5, 7, 1, 7, 7, 7 } },
                { 1, 1, new int[] {1, 2, 3, 4, 5} },
                { 0, 0, new int[] {} }
        };
        
        return Arrays.asList(parameters);
    }

    public MaxCountArraySearcherTest(int expectedValue, int expectedCount, int[] src) {
        this.expectedValue = expectedValue;
        this.expectedCount = expectedCount;
        this.src = src;
    }

    @Before
    public void setUp() {
        searcher = new MaxCountArraySearcher(src);
    }
    
    @Test
    public void itShouldFindMaxCount() {
        assertEquals(expectedCount, searcher.search().getCount());
    }

    @Test
    public void itShouldFindTheFirstValueWithTheMaxCount() {
        assertEquals(expectedValue, searcher.search().getValue());
    }

}
