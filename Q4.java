package Assignments.IfSwitchStatements4;

public class Q4 {

	public static void main(String[] args) {


		billCalc(99);
		billCalc(250);
	}

	private static void billCalc(int calls) {
		double bill=0;
		if (calls<=100) {
			bill=200;   }
		else if (calls>100 &&calls<=150) {
			bill=200+(0.6*50); 			 }
		else if (calls>150 &&calls<=200) {
			bill=200+(0.6*50)+(0.5*50);  }
		else if (calls>200) {
			bill=200+(0.6*50)+(0.5*50)+((calls-200)*0.4);  }
		System.out.println("ur bill for "+calls+" calls is "+bill);
		
	}

}
