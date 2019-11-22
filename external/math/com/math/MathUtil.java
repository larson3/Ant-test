package com.math;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class MathUtil {
	static Logger logger = Logger.getLogger(MathUtil.class);
	
	static public int add(int x, int y) {
		return x + y;
	}
}