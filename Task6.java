/* FORMING NEW WORD FROM A STRING */


import java.util.Scanner;

public class Task6 {
	static String formNewWord(String s,int n) {
		int n1=n*2;
		String s1=new String();
		if(s.length()>n1) {
			s1=s.substring(0,n)+s.substring(s.length()-n,s.length());
			return s1;
		}
		return null;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
		System.out.println(formNewWord(str, n));
				
	}
}
