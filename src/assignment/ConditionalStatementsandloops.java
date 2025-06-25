package assignment;

import java.util.HashMap;
import java.util.Map;

public class ConditionalStatementsandloops {

	void Empdetail(String name, double Rating, double BaseSalary, double Years) {

		System.out.print( name);
		
		if (Rating >= 4.0) {
			double hike = (BaseSalary + 15.0) + 1500;
			if (Years > 5.0) {
				hike = hike + 5000;
			}
			double hikePercentage = hike / BaseSalary;
			System.out.println(" - HikePercentage " + hikePercentage);
		}

		if (Rating >= 3.0 && Rating < 4) {
			double hike = (BaseSalary + 10.0) + 1200;
			if (Years > 5.0) {
				hike = hike + 5000;
			}
			double hikePercentage = hike / BaseSalary;
			System.out.println(" - HikePercentage " + hikePercentage);
		}

		if (Rating < 3.0) {
			double hike = (BaseSalary + 3.0) + 300;
			if (Years > 5.0) {
				hike = hike + 5000;
			}
			double hikePercentage = hike / BaseSalary;
			System.out.println(" - HikePercentage " + hikePercentage);
		}

	}

	public static void main(String[] args) {

		ConditionalStatementsandloops emp = new ConditionalStatementsandloops();
		emp.Empdetail("Alice Johnson", 4.2, 75000, 5.1);
		emp.Empdetail("Bob Smith", 3.8, 68000, 3.2);
		emp.Empdetail("Carol Davis", 4.5, 82000, 7.1);
		emp.Empdetail("David Brown", 2.5, 90000, 10.2);
		emp.Empdetail("Eva Green", 3.5, 60000, 2.4);
		
		

	}
}
