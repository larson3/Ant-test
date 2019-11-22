package com.math;

import org.junit.Test;

import org.junit.Assert;
import static org.junit.Assert.fail;

public class MathUtilTest {

    @Test
    public void testAdd() {
        Assert.assertEquals(1, MathUtil.add(-2,3));
    }
}