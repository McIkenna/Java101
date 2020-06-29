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
    	
  
    	String[] studentNames = new String[3];
    	studentNames[0] = "June";
    	studentNames[1] = "May";
    	studentNames[2] = "Sept";
    	
    	for(int i=0; i < studentNames.length; i++) {
    		System.out.println("Student " + (i + 1) + " is " + studentNames[i]);
    	}
    	
    	System.out.println(" ***********************************") ;
    	
    
    	int j = 0;
    	for(String student: studentNames) {
    		System.out.println("Student " + (++j) + " is " + student);
    	}
    	//Matrix Beginning
    	int matRow=2;
    	int matCol=3;
    	int[][] matA = new int[matRow][matCol];
    	
    	for(int row=0; row <matRow; row++) {
    		
    		System.out.println("Current row is " + row);
    		for(int col=0; col<matCol; col++) {
    			System.out.println("row=" + row + "col=" + col);
    			Scanner input = new Scanner(System.in);
    			System.out.println("Enter value for row "+row + ", col " + col);
    			matA[row][col] = input.nextInt();
    		}
    	}
    	
    	for(int row=0; row<matRow; row++) {
    		System.out.print("|" + "\t");
    		for(int col=0; col<matCol; col++) {
    			System.out.print(matA[row][col] + "\t");
    		}
    		System.out.println("|");
    	}
    	//Sum all the numbers on each row
    	for(int row=0; row<matRow; row++) {
    		int sumOfRow=0;
    		for(int col=0; col<matCol; col++) {
    			sumOfRow+=matA[row][col];
    		}
    		System.out.println("Sum of row "+ row + "=" + sumOfRow);
    	}
    	

    	//Assignment 4
    	
    	String[] Courses = new String[3];
    	
    	int rowData = 3;
    	int colData = 2;
    	int[][] studentData = new int[rowData][colData];
    	
    	for(int i=0; i <rowData; i++) {
    		System.out.println("******************" + ( i +1) + "***********************");
    		Scanner courses = new Scanner(System.in);
        	System.out.println("Enter Your Course Code: ");
        	Courses[i] = courses.next();
        	
    		for(int j=0; j<colData; j++) {
    			if(j <=0) {
    				Scanner scores = new Scanner(System.in);
                	System.out.print("Enter Your Scores: ");
                	int score = scores.nextInt();
                	if(score >= 0 && score <= 39) {
                		int point = 1;
                		studentData[i][j] = point;
                	}
                	
                	else if(score >= 40 && score <= 49) {
                		int point = 2;
                		studentData[i][j] = point;
                	}
                	
                	else if(score >= 50 && score <= 59) {
                		int point = 3;
                		studentData[i][j] = point;
                	}
                	
                	else if(score >= 60 && score <= 69) {
                		int point = 4;
                		studentData[i][j] = point;
                	}
                	else if(score >= 70 && score <= 100) {
                		int point = 5;
                		studentData[i][j] = point;
                	}
                	
                	
                	else {
                			System.out.print("Not a valid Grade"); break;
                			};
    					}
    			else {
    				Scanner creditHours = new Scanner(System.in);
        	    	System.out.println("Enter Credit Hours: ");
        	    	studentData[i][j] = creditHours.nextInt();
    			}	
    		}
    		
    	}
    	
    	System.out.println("*****************************************");
    	for(int i=0; i <rowData; i++) {
    		System.out.print("|" + "\t");
    		System.out.print(Courses[i] + "\t");
    		for(int j=0; j<colData; j++) {
    			System.out.print(studentData[i][j] + "\t");
    		}
    		System.out.println("|");
    	}
    	
    	double sumCredit =0;
		double cumSum = 0;
    	for(int i=0; i<rowData; i++) {
    		double cumAverage = 1;
    		for(int j=0; j<colData; j++) {
    			if(j >=1) {
    				sumCredit += studentData[i][j];
    			}
    			cumAverage*=studentData[i][j];
    			
    		}
    		cumSum += cumAverage;	
    	}
    	double GPA = cumSum / sumCredit;
    	System.out.println("Total Cummulative =" + cumSum);
		System.out.println("Sum of the Credits =" + sumCredit);
		System.out.println("Grade Point Average =" + GPA);
	
    	    	  */
    	
    	//Assignment 5
    	
    	int row = 2;
    	int col = 2;
    	int[][] matA = new int[2][2];
    	int[][] matB = new int[2][2];
    	int[][] matC = new int[2][2];
    	
    	System.out.println("******************* Row A **********************");
    	for(int i=0; i < row; i++ ) {
    		
    		for(int j=0; j<col; j++) {
    			
			Scanner input = new Scanner(System.in);
    		System.out.println("Enter number for matrix A " + "row" + i + " col" + j);
    		matA[i][j] = input.nextInt();
    		}
    	}
    	
    
			System.out.println("******************* Row B **********************");
    	for(int i=0; i < row; i++ ) {
    		
    		for(int j=0; j<col; j++) {
 
			Scanner input = new Scanner(System.in);
    		System.out.println("Enter number for Matrix B " + " row" + i + " col" + j);
    		matB[i][j] = input.nextInt();
    		}
    	}
    	
    	
    	
    	for(int i=0; i <row; i++) {
    		for(int j=0; j<col; j++) {
    			if(i == 0 && j==0) {
    				matC[i][j] = (matA[0][0]*matB[0][0]) + (matA[0][1]*matB[1][0]);
    			}
    			else if(i == 0 && j==1) {
    				matC[i][j] = (matA[0][0]*matB[0][1]) + (matA[0][1]*matB[1][1]);
    			}
    			else if(i == 1 && j==0) {
    				matC[i][j] = (matA[1][0]*matB[0][0]) + (matA[1][1]*matB[1][0]);
    			}
    			else if(i == 1 && j==1) {
    				matC[i][j] = (matA[1][0]*matB[0][1]) + (matA[1][1]*matB[1][1]);
    			}
    		}
    	}
    	System.out.println("******************* Row A **********************");
    	for(int i=0; i <row; i++) {
    		System.out.print("|" + "\t");
    		
    		for(int j=0; j<col; j++) {
    			System.out.print(matA[i][j] + "\t");
    		}
    		System.out.println("|");
    	}
    	
    	System.out.println("******************* Row B **********************");
    	for(int i=0; i <row; i++) {
    		System.out.print("|" + "\t");
    		
    		for(int j=0; j<col; j++) {
    			System.out.print(matB[i][j] + "\t");
    		}
    		System.out.println("|");
    	}
    	
    	System.out.println("****************** Result of Multiplication ***********************");
    	for(int i=0; i <row; i++) {
    		System.out.print("|" + "\t");
    		
    		for(int j=0; j<col; j++) {
    			System.out.print(matC[i][j] + "\t");
    		}
    		System.out.println("|");
    	}
    	
    	
    }
}
