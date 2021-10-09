package week.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj= new Calculator();		
		System.out.println("MY CALCULATOR");
		
		obj.add(2,4,6);
		System.out.println("The addition of 2, 4, 6 is:" +  +obj.add(2, 4, 6));
		
		obj.sub(10, 5);
		System.out.println("The subtraction of 10, 5 is:" + +obj.sub(10, 5));
		
	
		obj.mul(14, 5);
		System.out.println("The multiplication of 14, 5 is:" + +obj.mul(14, 5));
		
		obj.div(18, 6);
		System.out.println("The division of 18, 6 is:" + +obj.div(18, 6));
		
				
	}

}
