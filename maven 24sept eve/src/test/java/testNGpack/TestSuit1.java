package testNGpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSuit1 {

	
	
@BeforeClass
	
    public void beforeClass ()
    {
   	 System.out.println("@Before Class-TestSuit_1");
    }
    
    
    @BeforeMethod
	
    public void beforeMethod ()
    {
   	 System.out.println("@Before Method-TestSuit_1");
    }
    
    
    @Test 
    public void test1 ()
    {
   	 System.out.println("Test 1-TestSuit_1");
   	 
    }
    
    
    @Test 
    	
    public void test2 ()
    {
   	 System.out.println("Test 2-TestSuit_1");
    }
    
    
    @Test 
	
    public void test3 () 
    {
   	 System.out.println("Test 3-TestSuit_1");
   	
    }
    
    @Test 
    public void test4 ()
    {
   	 System.out.println("Test 4-TestSuit_1");
   	 
    }

    @AfterMethod
	
    public void afterMethod ()
    {
   	 System.out.println("After Method-TestSuit_1");
    }
    
    
    @AfterClass
    	
    public void afterClass ()
    {
   	 System.out.println("After Class-TestSuit_1");
    }
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
