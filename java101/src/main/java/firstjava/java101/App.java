package firstjava.java101;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	int totalPrice;
    	int price = 3;
    	int quantity = 8;
    	totalPrice = quantity*price;
    	//Changes
    	System.out.println( "total Price before discount: " + totalPrice );
    	if(totalPrice > 20) {
    		totalPrice -= (2*price);
    		
    	}
        System.out.println( "total Price after discount: " + totalPrice );
    }
}
