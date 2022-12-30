package week1.day2;

public class FibanocciSeries {

	public static void main(String[] args) {
		
		int range = 8;
		int firstnum=0;
		int secnum=1;
		int sum=0;
		System.out.println(firstnum);
		
		for(int i=1;i<range;i++) {
			sum = firstnum + secnum;
		    firstnum = secnum;
		    secnum = sum;
		   System.out.println(sum);

	}

}
}