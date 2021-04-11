package Assignments.IfSwitchStatements4;

public class Q7 {

	public static void main(String[] args) {

		secCalc(78);
		secCalc(3670);
		secCalc(87000);
	}

	private static void secCalc(int seconds) {

		if (seconds>=60&&seconds<3600) {
	System.out.println("number of minutes "+(seconds/60));} 
		else if (seconds>=3600&&seconds<86400) {
	System.out.println("number of hours "+(seconds/3600));}
		else if (seconds>=86400) {
	System.out.println("number of days "+(seconds/86400));}
	}

}
