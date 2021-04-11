package Assignments.IfSwitchStatements4;

public class Q1 {

	public static void main(String[] args) {

		calcBMI(150, 5, 5);
		
	}

	public static void calcBMI(int pounds, int feet, int inches) {
		double height=(feet*12+inches)*0.0254;
		double weight= pounds/2.2;
		double BMI=weight/(height*height);
		String result;
		if (BMI<18.5) {result="Underweight";}
		else if (BMI>=18.5&&BMI<25) {result="Normal weight";}
		else if (BMI>=25&&BMI<30) {result="Overweight";} 
		else {result="Obese";}
		
		System.out.println("Ur weight is "+pounds+" pounds.\n"+"Ur height is "+feet+" feet "+inches+" inches.");
		System.out.println("\nUr BMI is "+BMI+".\nU are "+result);
	}

}
