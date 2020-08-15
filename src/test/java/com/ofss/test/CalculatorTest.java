package com.ofss.test;

import org.junit.*;
import com.ofss.Calculator;

/*
 * mvn compile
 * mvn package
 * mvn clean
 * mvn test
 * mvn test-compile (just compile the test cases, not execute)
 * mvn package -DskipTests
 */
public class CalculatorTest {
 
    @Test
    public void testAdd() {
    	Calculator c=new Calculator();
    	Assert.assertEquals(7, c.add(2, 5));
    }
}