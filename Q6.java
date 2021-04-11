package Assignments.IfSwitchStatements4;

public class Q6 {

	public static void main(String[] args) {

		weightCalc(1000);
		weightCalc(1);
		weightCalc(10);
	}

	private static void weightCalc(int kg) {

		double newton=kg*9.8;

		if (newton>1000) {System.out.println("it is too heavy");} 
		else if (newton<10){System.out.println("it is too light");}
		else {System.out.print("the object weights "+newton+" Newtons");}
	}

}
