package Assignments.IfSwitchStatements4;

public class Q8 {

	public static void main(String[] args) {

		discountCalc(24);
		discountCalc(10);
	}

	private static void discountCalc(int packs) {

		double price=99*packs;
		double discount=0;
		
		if (packs>=10&&packs<20)
			{discount=price*0.2;}
		else if (packs>=20&&packs<50)
			{discount=price*0.3;}
		else if (packs>=50&&packs<100) 
			{discount=price*0.4;}
		else if (packs>=100) 
			{discount=price*0.5;}
		
	System.out.println("The total price is "+price+" and the discount is "+discount);
		
	}

}
