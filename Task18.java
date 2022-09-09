/* SORTING AND MERGING ARRAYLIST */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task18 {
	
	public static int  calculateElectricityBill(String r1,String r2,int r){
		
	    int a1=Integer.parseInt(r1.substring(5,r1.length()));
	    int a2=Integer.parseInt(r2.substring(5,r2.length()));
		int d=a2-a1;
		return d*r;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int n=sc.nextInt();
		
		System.out.println(calculateElectricityBill(str1,str2,n));
	}
}
