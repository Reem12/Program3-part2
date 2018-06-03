/*
 * This class has four test cases for the coin class  
 */


/**
 *
 * @author reem
 */
import coin.Coin;
import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitTest {
    
    public JUnitTest() {
    }
    
    @Test
	public void testMinAllZeroes() {
            int coins[] = {0,0,0,0,0};
                int num=0;
                for(int i=0;i<Coin.Min(coins,num).length;i++)
                     assertEquals( 0, Coin.Min(coins,num)[i]);
	}
	
	@Test
	public void testMinAllMax() {
		int coins[] = {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};
                int num=0;
                for(int i=0;i<Coin.Min(coins,num).length;i++) 
		 assertEquals(Integer.MAX_VALUE, Coin.Min(coins,0)[i]);
	}
       
        //test fails when an unexpected exception thrown  
       @Test
     public void testIndexOutOfBoundsExceptionNotRaised() 
    throws IndexOutOfBoundsException {
    int array[] = {};
    Coin.Min(array, 0);
		
} 
	//test pass when an expected exception thrown 
	@Test(expected  = IllegalArgumentException.class)
	public void testMinEmptyArray() {
		int array[] = {};
		Coin.Min(array, 0);
	}
        

   

    

   
}
