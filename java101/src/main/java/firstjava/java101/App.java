package firstjava.java101;
import java.util.Scanner;

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
    	Double modulus = 0.05;
    	totalPrice = quantity*price;
    	/* 
    	//Changes
    	System.out.println( "total Price before discount: " + totalPrice );
    	if(totalPrice > 20) {
    		int newTotalPrice;
    		newTotalPrice = totalPrice - (2*price);
    		System.out.println( "total Price after discount: " + newTotalPrice );
    	}
    	if(price > 5) {
    		Double newPrice;
    		newPrice = price + (totalPrice * modulus);
    		System.out.println( "New price after discount: " + newPrice );
    	}
    	
    	String quantityBox = "3";
    	String pricePerItemBox = "8";
    	double totalPriceFromBox;
    	
    	String totalPriceString = quantityBox + pricePerItemBox;
    	
    	System.out.println("Concatenation of String value " + totalPriceString);
    	
    	int quantityOfItem = Integer.parseInt(quantityBox);
    	double pricePerItem = Double.parseDouble(pricePerItemBox);
    	
    	totalPriceFromBox = quantityOfItem * pricePerItem;
    	System.out.println("Total price of items " + totalPriceFromBox);
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.println(" Enter value for x: ");
    	int x = scanner.nextInt();
    	System.out.println("Value for x: " + x);
    	
    
    	System.out.println(" Enter value for y: ");
    	int y = scanner.nextInt();
    	System.out.println("Value for x: " + y);
    	
    	Double xy = Math.pow(x,2) + 3 * x + 1 -3 * y -3 * x;
    	System.out.println("Answer is : " + xy);
    
    	
    	
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.print(" Enter value for x: ");
    	int x = scanner.nextInt();
    	System.out.println("Value for x: " + x);
    	
    
    	System.out.print(" Enter value for y: ");
    	int y = scanner.nextInt();
    	System.out.println("Value for x: " + y);
    	
    	int xy = 2*x + (y + 3*x * 4*y) - 2*x;
    	System.out.println("Answer is : " + xy);
    		*/
    	
    	Scanner promo = new Scanner(System.in);
    	System.out.print(" Enter Promo Code : ");
    	String promoCode = promo.next().toUpperCase();
    	String code = "SUMMER2020";
    	
    	System.out.println("promo code is : " + promoCode);
    	if(promoCode.equals(code) ) {
    		
    		Double newPromoTotal = totalPrice - totalPrice*0.1;
    		 System.out.print("Disounted Promo Price: " + newPromoTotal);
    	}
    }
}
