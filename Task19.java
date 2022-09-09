/* VALIDATING DATE FORMAT */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task19 {
 public static int sumOfDigits(String str)  {
	 int s=0;
	 for(int i=0;i<str.length();i++) {
		 char c=str.charAt(i);
		 if(Character.isDigit(c)) {
			 int b=Integer.parseInt(String.valueOf(c));
			 s=s+b;
		 }
	 }
	 return s;
	 
 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(sumOfDigits(s));
		
		
	}
}
