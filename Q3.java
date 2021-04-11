package Assignments.IfSwitchStatements4;

public class Q3 {

	public static void main(String[] args) {


		leapCalc(1992);
		leapCalc(2000);
		leapCalc(1900);
//		leapCalc(1800);
//		leapCalc(1600);
	}

	private static void leapCalc(int year) {

		
			if (year%4==0 && year%100!=0) 
			{System.out.println("Leap year");}
			
			else if (year%400==0 && year%100==0) 
			{System.out.println("Leap year");}
		
		else {System.out.println("NOT a leap year");}
	}

}
