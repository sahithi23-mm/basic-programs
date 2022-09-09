
/*CHECK CHARACTERS IN A STRING */


import java.util.Scanner;

public class Task15 {

	public static int getBigDiff(int a[],int n) {
		int s=0,f=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				s=a[i]-a[j];
				if(s>f) {
					f=s;
				}
			}
		}
		return f;
		
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int[] a=new int[s];
		for(int i=0;i<s;i++) {
			a[i]=sc.nextInt();
		}
		
			System.out.println(getBigDiff(a,s));
		
	}
}
