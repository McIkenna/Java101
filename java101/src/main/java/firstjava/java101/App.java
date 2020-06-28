package firstjava.java101;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	/* 
    	 int totalPrice;
    	int price = 6;
    	int quantity = 8;
    	Double modulus = 0.05;
    	totalPrice = quantity*price;
    	//Changes
    
    	System.out.println( "total Price before discount: " + totalPrice );
    	if(totalPrice > 20) {
    		int newTotalPrice;
    		newTotalPrice = totalPrice - (2*price);
    		System.out.println( "total Price after discount: " + newTotalPrice );
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
    		
    	//ASSIGNMENT 1
    	if(price > 5) {
    		Double newPrice;
    		newPrice = price + (totalPrice * modulus);
    		System.out.println( "New price after discount: " + newPrice );
    	}
    	
    	//ASSIGNMENT 2
    	
    	int totalPrice;
    	int price = 30;
    	
    	Scanner quant = new Scanner(System.in);
    	System.out.print("Enter the Quantity you want: ");
    	int quantity = quant.nextInt();
    	Double disPercentage = 0.1;
    	totalPrice = quantity*price;
    	
    	Scanner promo = new Scanner(System.in);
    	System.out.print(" Enter Promo Code : ");
    	String promoCode = promo.next().toUpperCase();
    	String code = "SUMMER2020";
    	System.out.println("promo code is : " + promoCode);
    	
    	if(promoCode.equals(code) && totalPrice > 200) {
    		
    		Double newPromoTotal = totalPrice * (1 - disPercentage);
    		 System.out.print("Disounted Promo Price: " + newPromoTotal);
    	}
    	else {
    		System.out.print(" The total Price is : " + totalPrice);
    		} 
    		
    		//ASSIGNMENT 3
    	Scanner grade = new Scanner(System.in);
    	System.out.print("Enter your grade: ");
    	Double grades = grade.nextDouble();
    	
    	if(grades >= 0 && grades <= 39) {
    		System.out.println("You got an F, Failed");
    		
    	}
    	
    	else if(grades >= 40 && grades <= 49) {
    		System.out.println("You Got an E: Passed");
    	}
    	
    	else if(grades >= 50 && grades <= 59) {
    		System.out.println("You Got a D: Passed");
    	}
    	
    	else if(grades >= 60 && grades <= 69) {
    		System.out.println("You Got a C: Passed");
    	}
    	else if(grades >= 70 && grades <= 85) {
    		System.out.println("You Got a B: Good!");
    	}
    	
    	else if(grades >= 86 && grades <= 100) {
    		System.out.println("You Got an A: Excellent");
    	}
    	else {
    			System.out.print("Not a valid Grade");
    			};
    		
    	
    	String[] itemNames = new String[5];
    	int size = itemNames.length;
    	double[] itemPrices = new double[size];
    	int[] itemQuantities = new int[size];
    	double[] totalCostPerItems = new double[size];
    	
    	double totalAmount = 0.0;
    	
    
    			
    	for(int i= 0; i < size; i++) {
    		
    		System.out.println("*********** item" + (i + 1) + "*************");
    		Scanner input = new Scanner(System.in);
    		System.out.println("Enter Item Name: ");
    		String itemName = input.nextLine();
    		itemNames[i] = itemName;
    		
    		System.out.println("Enter Item Quantity: ");
    		int itemQuantity = input.nextInt();
    		itemQuantities[i] = itemQuantity;
    		
    		System.out.println("Enter Item Price: ");
    		double itemPrice = input.nextDouble();
    		itemPrices[i] = itemPrice;
    		
    		double totalCostPerItem = itemQuantity * itemPrice;
    		totalCostPerItems[i] = totalCostPerItem;
    		
    		
        	totalAmount +=totalCostPerItem;
        			
    	}
    	System.out.print("ItemName \t | ");
    	System.out.print("ItemPrice \t | ");
    	System.out.print("ItemQuantity \t | ");
    	System.out.println("TotalCost \t | ");
    	for(int i = 0; i<size; i++) {
    		System.out.print(itemNames[i] + " \t | ");
        	System.out.print(itemPrices[i] + "\t | ");
        	System.out.print(itemQuantities[i] + "\t | ");
        	System.out.println(totalCostPerItems[i] + "\t | ");
    	}
    	
    	DecimalFormat dFormat = new DecimalFormat("####,###,###.00");
    	String formatTotalAmount = "$" + dFormat.format(totalAmount);
         
    	System.out.println("Total Amount: " + formatTotalAmount);
    	
    */
    	
    }
}
