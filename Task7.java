/* REVERSING A NUMBER */


import java.util.Scanner;

public class Task7 {
public static int reverseNumber(int n) {
	int s=0;
	while(n!=0) {
		int r=n%10;
		s=s*10+r;
		n=n/10;
	}
	return s;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(reverseNumber(n));
		
	}
}
