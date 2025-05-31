package assignment;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Collections {
	

	public static void main(String[] args) {
		
       
		Map<String,String> student1 = new HashMap<>();
		student1.put("Name","JohnDoe");
		student1.put("Age","Twenty");
		student1.put("Gender","Male");
		student1.put("Grade","A++");
		student1.put("Major","ComputerScience");
		student1.put("GPA","A3.8");
		student1.put("Email","john@gmail.com");
		
		Map<String,String> student2 = new HashMap<>();
		student2.put("Name","Janesmith");
		student2.put("Age","Twenty one");
		student2.put("Gender","Female");
		student2.put("Grade","B+");
		student2.put("Major","Mathematics");
		student2.put("GPA","A3.5");
		student2.put("Email","jane@gmail.com");
		
		Map<String,String> student3 = new HashMap<>();
		student3.put("Name","MikeBrown");
		student3.put("Age","Twenty two");
		student3.put("Gender","Male");
		student3.put("Grade","A+");
		student3.put("Major","Physics");
		student3.put("GPA","A3.9");
		student3.put("Email","jane@gmail.com");
		
		List<Map<String,String>> Students = new LinkedList<>();
		Students.add(student1);
		Students.add(student2);
		Students.add(student3);
		
		Map<String,String> Employee1 = new HashMap<>();
		Employee1.put("EmpID","E 001");
		Employee1.put("Name","Alice Green");
		Employee1.put("Age","Thirty");
		Employee1.put("Gender","Female");
		Employee1.put("Department","Engineering");
		Employee1.put("Postion","Software Engineer");
		
		
		Map<String,String> Employee2 = new HashMap<>();
		Employee2.put("EmpID","E 002");
		Employee2.put("Name","Bob Johnson");
		Employee2.put("Age","Thirty Five");
		Employee2.put("Gender","male");
		Employee2.put("Department","Marketing");
		Employee2.put("Postion","Marketing Manager");
		
		Map<String,String> Employee3 = new HashMap<>();
		Employee3.put("EmpID","E 003");
		Employee3.put("Name","Carol White");
		Employee3.put("Age","Twenty Eight");
		Employee3.put("Gender","Female");
		Employee3.put("Department","Sales");
		Employee3.put("Postion","Sales Executive");
		
		List<Map<String,String>> Employee = new LinkedList<>();
		Employee.add(Employee1);
		Employee.add(Employee2);
		Employee.add(Employee3);
		
	/*    List<List<Map<String,String>>> Total = new LinkedList<>();
	    Total.add(Employee);
	    Total.add(Students);
	    
	    System.out.println(Total.get(0).get(2).get("Age"));
	
	*/
		
		Map<String,String> Product1 = new HashMap<>();
		Product1.put("ProductID","P 001");
		Product1.put("Name","Laptop");
		Product1.put("Catgory","Electronics");
		Product1.put("Price","12k pounds");
		Product1.put("Stock Quantity","Not Available");
		Product1.put("Supplier","Tech Supplies");
		Product1.put("Warrenty","2");
		
		Map<String,String> Product2 = new HashMap<>();
		Product2.put("ProductID","P 002");
		Product2.put("Name","Desk Chair");
		Product2.put("Catgory","Furniture");
		Product2.put("Price","150K Pounds");
		Product2.put("Stock Quantity","Two");
		Product2.put("Supplier","Office Depot");
		Product2.put("Warrenty","1");
		
		Map<String,String> Product3 = new HashMap<>();
		Product3.put("ProductID","P 002");
		Product3.put("Name","Desk Chair");
		Product3.put("Catgory","Furniture");
		Product3.put("Price","150K Pounds");
		Product3.put("Stock Quantity","Two");
		Product3.put("Supplier","Office Depot");
		Product3.put("Warrenty","1");
	
		
		List<Map<String,String>> Products = new LinkedList<>();
		Products.add(Product1);
		Products.add(Product2);
		Products.add(Product3);
	    
		
		
		List<List<Map<String,String>>> value = new LinkedList<>();
		value.add(Students);
		value.add(Employee);
		value.add(Products);
		
		
		System.out.println(value.get(2).get(2).get("Supplier"));
		
		
		
		
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		

}

}