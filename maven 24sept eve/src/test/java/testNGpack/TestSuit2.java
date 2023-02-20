package testNGpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSuit2 {

	
@BeforeClass
	
    public void beforeClass ()
    {
   	 System.out.println("@Before Class-TestSuit_2 ");
    }
    
    
    @BeforeMethod
	
    public void beforeMethod ()
    {
   	 System.out.println("@Before Method-TestSuit_2");
    }
    
    
    @Test (priority=2)
    public void testA ()
    {
   	 System.out.println("Test A-TestSuit_2");
   	 
    }
    
    
    @Test 
    	
    public void testB ()
    {
   	 System.out.println("Test B-TestSuit_2");
    }
    
    
    @Test (priority=1)
	
    public void testC () 
    {
   	 System.out.println("Test C-TestSuit_2");
   	
    }
    
    @Test 
    public void testD ()
    {
   	 System.out.println("Test D-TestSuit_2");
   	 
    }

    @AfterMethod
	
    public void afterMethod ()
    {
   	 System.out.println("After Method-TestSuit_2");
    }
    
    
    @AfterClass
    	
    public void afterClass ()
    {
   	 System.out.println("After Class-TestSuit_2");
    }
    
	
}
