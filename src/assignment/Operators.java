package assignment;

import java.util.Scanner;

public class Operators {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi! John Doe, what is your credit score?");
		int a = sc.nextInt();

		if (a > 750) {
			System.out.println("Loan is automatically approved");
		}

		else if (a >= 650 && a <= 750) {
			System.out.println("Additional checks are required" + "" + ":-");
			System.out.println("          ");
			System.out.println("What is your income ?");
			int b = sc.nextInt();

			if (b >= 50000) {
				System.out.println("Loan can be considered but thier is one condition:-");
				System.out.println("    ");
				System.out.println("Are you emloyed?");
				String c = sc.next();
				if (c.equals("yes")) {
					System.out.println("Loan is considered but thier is one more check required:-");

					System.out.println("What is your debt to income ratio");
					int d = sc.nextInt();

					if (d < 40) {
						System.out.println("YIIPEE !! LOAN IS APPROVED");
					}

					else {
						System.out.println("Sorry!! Loan is denied");
					}
				}

				else if (c.equals("no")) {
					System.out.println("Sorry!! Loan is denied");
				}

			} else {
				System.out.println("Loan is denied");
			}
		}

		else {
			System.out.println("Load is denied");
		}
	}

}



 
		
		

