/* VALIDATING DATE FORMAT */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task9 {
 public static int validateDate(String date)  {
	 if(date.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}")) {
	 SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
	 try {
	 Date Date1 = sdfrmt.parse(date); 
	 return (1);
 }catch(ParseException e) {
		 return -1;
	 }
	 }
	 return -1;
	 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.next();
		int a=validateDate(s1);
		if(a<0) {
			System.out.println("Invalid date format ");
		}
		else {
			System.out.println("Valid date format ");
		}
		
	}
}
