/* SORTING AND MERGING ARRAYLIST */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task8 {
	
	public static ArrayList<Integer> sortMergedArrayList(ArrayList<Integer> a1,ArrayList<Integer> a2){
		
	a1.addAll(a2);
	Collections.sort(a1);
	ArrayList<Integer> res=new ArrayList<Integer>();
	res.add(a1.get(2));
	res.add(a1.get(6));
	res.add(a1.get(8));
	return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a1=new ArrayList<Integer>();
		ArrayList<Integer> a2=new ArrayList<Integer>();
		for(int i=0;i<=5;i++) {
			a1.add(sc.nextInt());
		}
		for(int i=0;i<=5;i++) {
			a2.add(sc.nextInt());
		}
		System.out.println(sortMergedArrayList(a1,a2));
	}
}
