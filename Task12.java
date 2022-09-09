/* PASSWORD VALIDATION */


import java.util.Scanner;

public class Task12 {
	static int validatePassword(String s){
	
		if(s.length()>=6 && s.length()<=20) {
			if(s.matches(".*[0-9]{1,}.*")) {
				if(s.matches(".*[@,#,$]{1,}.*")) {
					return 1;
				}
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		int a=validatePassword(str);
		if(a<0) {
			System.out.println("Invalid Password");
			
		}
		else {
			System.out.println("Valid Password");
		}
		
		
				
	}

}
