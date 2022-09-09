
/*SUM OF ODD DIGITS */


import java.util.Scanner;

public class Task1 {
	// method to check the condition
	static int checkSum(int num) {
		int s=0;
		while(num!=0) {
			int r=num%10;
			 s=s+r;
			 num=num/10;
			
		}
		if(s%2==0) {
			return -1;
			
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		//Scanning the number
		int n=sc.nextInt();
		int a=checkSum(n);
		if(a<0) {
			System.out.println("Sum of odd digits is even ");
		}
		else {
			System.out.println("Sum of odd digits is odd ");
		}
	}

}
