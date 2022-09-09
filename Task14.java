/* SUM OF POWERS OF ELEMENTS IN AN ARRAY */

import java.util.Scanner;

public class Task14 {
	public static int getSumOfPower(int a[],int n) {
		int s=0;
		for(int i=0;i<n;i++) {
		   
			int r=(int) Math.pow(a[i], i);
			s=s+r;
		}
		return s;
	}
		
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int[] a=new int[s];
		for(int i=0;i<s;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(getSumOfPower(a,s));
		
		
	}

}
