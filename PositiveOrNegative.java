package week1.day2;

public class PositiveOrNegative {

	public static void main(String[] args) {
		int x=35;
		
		if(x<0) {
			System.out.println(x+ "is a negative number");
		}

		else {
			if(x>0)
				System.out.println(x+ "is a positive number");
			
			else
				System.out.println(x+ "neither positive nor negative");
		}
	}

}
