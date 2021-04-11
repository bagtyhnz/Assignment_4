package Assignments.IfSwitchStatements4;

public class Q5 {

	public static void main(String[] args) {

		specialDateCalc(6,10,60);
		specialDateCalc(24, 3, 91);
	}

	private static void specialDateCalc(int day, int month, int year) {

		if (day*month==year) {
			System.out.println("the deate is MAGIC!!!");
		} else {
			System.out.println("just a normal date...");

		}
		
	}

}
