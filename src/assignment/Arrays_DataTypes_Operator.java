package assignment;

import java.util.HashMap;
import java.util.Map;

public class Arrays_DataTypes_Operator {

	public static void main(String[] args) {

		
		String[] studentnames = new String[3];
		studentnames[0] = "Suresh";
		studentnames[1] = "Mahesh";
		studentnames[2] = "Naresh";
		
		int[] marks = new int[3];
		marks[0] = 75;
		marks[1] = 80;
	    marks[2] = 82;
	
		
/*		String [] marks = new String[3];
		marks[0] = "75";
		marks[1] = "80";
	    marks[2] = "82";
*/		
//	   String [][] Data = {studentnames, marks};
	   
//	   System.out.println(Data[0][1]);
	    
	    marks[0]+= 10;
	    marks[1]+= 10;
	    marks[2]+= 10;
	    
	   Map<String,Integer> StudentData= new HashMap<>();
	   StudentData.put("Suresh",75);
	   StudentData.put("Mahesh",80);
	   StudentData.put("Naresh",82);
	   
	    
	    
	    
	    int sum = marks[0] + marks[1] + marks[2];
	    int average = sum/3;
	    System.out.println(average);
	    
	    

	    
	    
	    
	    
	    
	    
	   
	   
		
		
		
		
	}

}
