
/*CHECK CHARACTERS IN A STRING */


import java.util.Scanner;

public class Task5 {

	public static int checkCharacters(String str) {
		int a=str.length();
		if(str.charAt(0)==str.charAt(str.length()-1)){
			return 1;
		}
		return -1;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int a=checkCharacters(s);
		if(a<0) {
			System.out.println("Invalid");
		}
		else {
			System.out.println("Valid");
		}
	}
}
