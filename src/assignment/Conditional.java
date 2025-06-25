package assignment;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Conditional {

	public static void main(String[] args) {
		
    	Map<Integer,Integer> Transactions = new HashMap<>();
		Transactions.put(1, 50000);
		Transactions.put(2, -2000);
		Transactions.put(3, 3000);
		Transactions.put(4, -15000);
		Transactions.put(5, -200);
		Transactions.put(6, -300);
		Transactions.put(7, 4000);
		Transactions.put(8, 3000 );
		
	
		
		System.out.println("Total number of transactions completed is " + Transactions.size());
		
		System.out.println();

		int sum = Transactions.get(1) + Transactions.get(3) + Transactions.get(7);
		System.out.println("Sum of credited amount is: " + sum);
		
		System.out.println();
		
		int sumdebited = Transactions.get(2) + Transactions.get(4) + Transactions.get(5) + Transactions.get(6);
		System.out.println("Sum of debited amount is: " + sumdebited);
		System.out.println();
		
		int remaining = sum + sumdebited;
		System.out.println("Remaining amount is: " + remaining);
		System.out.println();
		
		
		
		
	 for (int value : Transactions.values())
		
		 if (value>10000) {
			 
			 System.out.println("Suspicious credit Transaction with Amount");
			 
		 }
	  
	 for (int value : Transactions.values())
			
		 if (value<-10000) {
			 
			 System.out.println("Suspicious debit Transaction with Amount");
			 
		 }
	// System.out.println("value: " + value);
		
		
		
	}

}
