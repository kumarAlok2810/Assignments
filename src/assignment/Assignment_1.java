package assignment;

public class Assignment_1 {

	public static void main(String[] args) {

/*	Practice 2d and 3d    
 * 
 * String [] subject = {"math 1", " math 2"," DS" , "ALG"};
	    String [] Status  = {"Pass 78", "Fail 20" , "Pass 78", "Pass 89"};
		String [][] Sem1 = {subject , Status};
		

		System.out.println(Sem[0][1]);
		System.out.println(Sem[1][2]);

		
		String [] subject2 = {"math 1", " math 2"," DS" , "ALG"};
		String [] Status2  = {"Pass 78", "Fail 20" , "Pass 78", "Pass 89"};
		String [][] Sem2 = {subject2 , Status2};
		
		String [][][]Semesters = {Sem1,Sem2};
	    System.out.println(Semesters[0][1][2]);

*
    Question Attempted ->>>
*/		
		
		
		
		String[][][] Array = {
			{ {"Mathematics 1",   "Pass 78"}, 
			   {"Physics"     ,    "pass85"}, 
			   {"Chemistry"   ,    "Fail21"},
			   {"ComputerProgramming","Pass74"},
			   {"Engineering Drawing","Pass88"},
			   {"Basic Electrical Eng.","Pass79"}
			},
			
			{ {"Mathematics 2", "Pass82"},
				{"Mechanics", "pass77"}, 
				{"Environmental Sci","Pass93"},
				{"Basic Electronics","Fail19"},
				{"Engineering Physics","Fail24"},
				{"Engineering Graphics","Pass90"},
			},
			
			{ {"Data Structures", "Pass88"},
				{"Discrete Mathematics", "pass81"}, 
				{"Digital Electrinics","Pass76"},
				{"Operating systems","Fail32"},
				{"Signals and systems","Pass85"},
				{"Object Oriented Programming","Pass78"},
			},
			
			{ {"Algorithms", "Pass91"},
				{"Computer Networks", "pass73"}, 
				{"Database Systems","Fail19"},
				{"Microprocessors","Fail80"},
				{"Communication Engineering","Pass76"},
				{"Software Engineering","Pass87"},
			},
			
			{ {"Probability&Stats", "Pass86"},
				{"Machine Learning", "pass88"}, 
				{"Compiler Design","Pass84"},
				{"Theory of CAOMPUTATION","Pass95"},
				{"Embedded Systems","Pass73"},
				{"Computer Grphics","Pass90"},
			},
		};
	
		System.out.println(Array[1][3][0]);
		System.out.println(Array[1][4][0]);
		System.out.println(Array[3][2][1]);
		System.out.println(Array[3][5][1]);
	}
	
	
}

			
			
