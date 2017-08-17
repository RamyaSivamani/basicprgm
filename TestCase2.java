//package com.javatpoint.testcase;  
  
//import static org.junit.Assert.assertEquals;  
//import org.junit.After;  
//import org.junit.AfterClass;  
import org.junit.Before;  
import org.junit.BeforeClass;  
//import org.junit.Test;  
//import com.javatpoint.logic.Calculation;  
  
public class TestCase2 {  
  
    @BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");  
    }  
    @Before  
    public void setUp() throws Exception {  
        System.out.println("before");  
    }  
}