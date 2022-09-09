/* FETCHING MIDDLE CHARACTERS FRO STRING */

import java.util.Scanner;

public class Task4 {
	public static String getMiddleIntegers(String str) {
		StringBuffer s1=new StringBuffer();
		if(str.length()%2==0) {
			s1.append(str.substring((str.length()/2)-1,(str.length()/2)+1));
			
		}
		return s1.toString();
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(getMiddleIntegers(s));
		
		
	}

}
