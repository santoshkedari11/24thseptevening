package testNGpack;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgKey {

	
	
	@BeforeClass
	
    public void beforeClass ()
    {
   	 System.out.println("@Before Class");
    }
    
    
    @BeforeMethod
	
    public void beforeMethod ()
    {
   	 System.out.println("@Before Method");
    }
    
    
    @Test (priority=0)
    public void test2 ()
    {
   	 System.out.println("Test 2");
   	 
    }
    
    
    @Test (priority=2)
    	
    public void test1 ()
    {
   	 System.out.println("Test 1");
    }
    
    
    @Test (timeOut=3000)
	
    public void test3 () throws InterruptedException
    {
   	 System.out.println("Test 3");
   	 Thread.sleep(4000);
   	 System.out.println("Hi");
    }
    
    @Test (priority=3)
	
    public void test4 ()
    {
   	 System.out.println("Test 4");
   	 
    }

    @AfterMethod
	
    public void afterMethod ()
    {
   	 System.out.println("After Method");
    }
    
    
    @AfterClass
    	
    public void afterClass ()
    {
   	 System.out.println("After Class");
    }
    
                     
    }


