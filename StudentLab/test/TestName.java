/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;
import studentlab.Name;
import static org.junit.Assert.*;

/**
 *
 * @author drewgascoigne
 */
public class TestName 
{
    
    Name myName;
    Name hisName;
    Name someName;
    public TestName() 
    {
        myName = new Name("Drew","Gascoigne");
        hisName = new Name("Abdullah","Adeeb");
        someName = new Name("","");
        testtoString();
        testEquals();
    }
    
  
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
      public void testtoString() 
    {
	
        Assert.assertEquals("Drew Gascoigne",myName.toString());
       
        Assert.assertEquals("Abdullah Adeeb", hisName.toString());
        
        Assert.assertEquals("N/A",someName.toString());
		
    }
    public void testEquals() 
    {
        boolean tester;
	tester = myName.equals(myName);
        Assert.assertEquals(true,tester);
        tester = hisName.equals(myName);
        Assert.assertEquals(false,tester);
        tester = someName.equals(someName);
        Assert.assertEquals(true,tester);
    }
}