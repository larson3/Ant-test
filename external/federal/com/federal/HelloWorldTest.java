package com.federal;

import org.junit.Test;

import org.junit.Assert;
import static org.junit.Assert.fail;
import com.math.MathUtil;
import java.util.logging.Logger;

public class HelloWorldTest {
	private static Logger logger = Logger.getLogger(HelloWorldTest.class.getName());
	
    @Test
    public void testNothing() {
		Assert.assertEquals(0, 0);
    }

    @Test
    public void testWillAlwaysFail() {
        fail("An error message");
    }
	
    @Test
    public void testAdd() {
		int	value1 = MathUtil.add(-2,3);
		int	value2 = MathUtil.add(-2, MathUtil.add(4,-2));
		int	value3 = MathUtil.add(2, -5);
		
		logger.info("value1: " + value1);
		logger.info("value2: " + value2);
		logger.info("value3: " + value3);
		
        Assert.assertEquals(1, value1);
        Assert.assertEquals(0, value2);
		Assert.assertEquals(-3, value3);
    }
}