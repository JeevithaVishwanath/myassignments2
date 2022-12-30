package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
int num= 34343;
int rev=0,a;
for (int i=num;i>0;i=i/10) {
	a=i%10;
	rev=(rev*10)+a;
}
	if(rev==num)
	{
		System.out.println(num+" is a palindrome");
	}
	else
	{
		System.out.println(num+" is not a palindrome");
	}
}
}

