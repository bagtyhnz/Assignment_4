package Assignments.IfSwitchStatements4;

public class Q9 {

	public static void main(String[] args) {

		shipCalc(2, 550);
		shipCalc(11, 450);
		shipCalc(5, 1005);
	}

	private static void shipCalc(int pounds, int miles) {
		double charges=0;
		int dist=1;
		if (pounds<=2) {
			charges=1.1;}
		else if (pounds>2 && pounds<6) {
			charges=2.2;}
		else if (pounds>6 && pounds<10) {
			charges=3.7;}
		else if (pounds>10) {
			charges=3.7;}
		
		if (miles>500&&miles%500!=0) 
		{dist=miles/500+1;}
		else {dist=1;}
		
		System.out.println("shipping charges are "+(float)(charges*dist));
	}

}
