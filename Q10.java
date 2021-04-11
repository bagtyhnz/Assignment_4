package Assignments.IfSwitchStatements4;

public class Q10 {

	public static void main(String[] args) {


		calorieCalc(180,10);
		calorieCalc(100, 3);
	}

	private static void calorieCalc(int totalCal, int fat) {

		int fatPercentage=(fat*9*100)/totalCal;
		System.out.println("calories from fat: "+fatPercentage+"%");
		if ((fat*9)<(totalCal*0.3)) {
			System.out.println("the food is low in fat");}
		else if((fat*9)>totalCal){
			System.out.println("input is invalid");
		}
		
	}

}
