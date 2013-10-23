/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author drewgascoigne
 */
public class TestProfessor {
    
    
    Professor one;
    Professor two;
    Professor three;
    public TestProfessor() 
    {
        one = new Professor("The","Prof");
        two = new Professor("A","Prof");
        three = new Professor("","");
        testgetOffice();
    }
    public void testgetOffice()
    {
        String oneOff = "ME 4233";
        String twoOff = "MC 5050";
        String threeOff = "";
        one.setOffice(oneOff);
        two.setOffice(twoOff);
        three.setOffice(threeOff);
        Assert.assertEquals("ME 4233",one.getOffice());
       
        Assert.assertEquals("MC 5050", two.getOffice());
        
        Assert.assertEquals("N/A",three.getOffice());    
    }
    
   
}