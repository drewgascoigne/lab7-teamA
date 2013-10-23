

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;
import studentlab.Person;

/**
 *
 * @author drewgascoigne
 */
public class TestPerson {
    Person pman;
    Person zeroman;
    
    public TestPerson() 
    {
        pman = new Person("Drew","Gas");
        zeroman = new Person("","");
        
    }
    public void testgetLastName()
    {
       Assert.assertEquals("",zeroman.getLastName());
       Assert.assertEquals("Gascoigne",pman.getLastName());
    }
     public void testgetFirstName()
    {
       Assert.assertEquals("",zeroman.getFirstName());
       Assert.assertEquals("Drew",pman.getFirstName());
    }
    public void testgetFullName()
    {
       Assert.assertEquals("",zeroman.getFullName());
       Assert.assertEquals("Drew Gascoigne",pman.getFullName());
    }
    public void testgetAddress()
    {
        
    }
    public void testgetCourses()
    {
    }
    public void testtoString()
    {
    }
    public void testEquals()
    {
    }
  
}