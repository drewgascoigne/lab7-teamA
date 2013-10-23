

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import studentlab.Address;

/**
 *
 * @author drewgascoigne
 */
public class testAddress extends TestCase
{
    Address myhome; 
    Address nothome;
    Address zerohome;
    
    public testAddress() 
    {
        try {
            myhome = new Address("Pellan Crescent", "Ottawa", "k2k1j6");
        } catch (Exception ex) {
            Logger.getLogger(testAddress.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {
            nothome = new Address(51, "Campeau", "Ottawa", "k2k1z5");
        } catch (Exception ex) {
            Logger.getLogger(testAddress.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            nothome = new Address("", "", "");
        } catch (Exception ex) {
            Logger.getLogger(testAddress.class.getName()).log(Level.SEVERE, null, ex);
        }
        testtoString();
        testEquals();
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    public void testtoString() 
    {
      
	
        Assert.assertEquals("Street: Pellan Crescent, City: Ottawa, PC: k2k1j6",myhome.toString());
       
        Assert.assertEquals("Unit: 51, Street: Campeau, City: Ottawa, PC: k2k1z5",nothome.toString());
     
        Assert.assertEquals("N/A",zerohome.toString());
		
    }
    public void testEquals() 
    {
        
       boolean tester;
	tester = myhome.equals(myhome);
        Assert.assertEquals(true,tester);
        tester = nothome.equals(myhome);
        Assert.assertEquals(false,tester);
        tester = zerohome.equals(zerohome);
        Assert.assertEquals(true,tester);
    }
}