
/*STRING CONCATINANTION */


import java.util.Scanner;

public class Task20 {
	// method to check the condition
	static String concatstring(String s1,String s2) {
		
		 return s1+s2;
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(concatstring(s1,s2));
		
	}

}
