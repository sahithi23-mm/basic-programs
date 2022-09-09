/* NUMBER VALIDATION */


import java.util.Scanner;

public class Task2 {
	static int validateNumber(String s){
		if(s.length()==12) {
			if(s.matches("[0-9]{3}[-][0-9]{3}[-]123-456-7890[0-9]{4}")) {
				return 1;
			}
			else {
				return -1;
			}
			
		}
		
		return -1;
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		int a=validateNumber(str);
		if(a>0) {
			System.out.println("Valid Number Format ");
		}
		else {
			System.out.println("InValid Number Format  ");
		}
		
				
	}

}
