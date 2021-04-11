package Assignments.IfSwitchStatements4;

public class Q2 {

	public static void main(String[] args) {

		taxCalc(1500);
		taxCalc(1200000);
//		taxCalc(1800000000);
		
	}

	public static void taxCalc(int income) {
			double tax = 0;
		if (income<=150000000) {
			tax=income*0.25;}
		
		else if (income>150000000 && income<=300000000) {
			tax=(income-150000000)*0.3+150000000*0.25;}
		else if (income>300000000 && income<=600000000) {
			tax=income*0.35;}
		else if (income>600000000 && income<=1200000000) {
			tax=income*0.4;}
		else if (income>1200000000) {
			tax=income*0.5;}
		System.out.println("Ur income is "+income+"\nThe tax amount to pay is "+tax+"\n");
	}

}
