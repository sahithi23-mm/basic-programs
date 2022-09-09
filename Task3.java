
/* SUM OF SQUARES OF EVEN DIGITS  */

import java.util.Scanner;

public class Task3 {
	static int sumOfSquaresOfEvenDigits(int n) {
		int s=0;
		while(n!=0) {
			int r=n%10;
			if(r%2==0) {
				s=s+r*r;
			}
			n=n/10;
		}
		return s;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(sumOfSquaresOfEvenDigits(n));
		
	}
}
