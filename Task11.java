
/*SUM OF ODD DIGITS */


import java.util.Scanner;

public class Task11 {
	// method to check the condition
	static String encrypt(String s) {
		String sb2="";
		StringBuffer sb1= new StringBuffer();
		for(int i=1;i<s.length();i++) {
			char c=s.charAt(i);
			if(i%2!=0) {
				c=(char) (c+1);
				sb1.append(c);
			}
		 sb2=sb1.toString();
		
		}
		 return sb2;
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(encrypt(s));
		
	}

}
