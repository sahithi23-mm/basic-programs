
/* REMOVE EVEN VOWELS  */

import java.util.Scanner;

public class Task13 {
	static String removeEvenVowels(String s) {
		
		StringBuffer sb1=new StringBuffer();
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				sb1.append(s.charAt(i));
				
			}
			if(i%2!=0) {
				if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u') {
					sb1.append(s.charAt(i));
				}
			}
		}
		String s1= sb1.toString();
		return s1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		System.out.println(removeEvenVowels(n));
		
	}
}
