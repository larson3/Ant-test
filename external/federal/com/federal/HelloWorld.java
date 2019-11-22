package com.federal;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import com.math.MathUtil;

public class HelloWorld {
    static Logger logger = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {
		logger.info("Hello World, 2+4=" + MathUtil.add(2,4));          // the old SysO-statement
    }
}