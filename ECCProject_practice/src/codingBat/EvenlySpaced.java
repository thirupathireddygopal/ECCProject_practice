package codingBat;

import java.util.Scanner;

public class EvenlySpaced {

	public static boolean evenlySpaced(int a, int b, int c) {
		int small = a;
		int big = 0;
		int med = 0;
		if(b < small){
			small = b;
		}
		if(c < small){
			small = c;
		}
		if(small == a){
			if(b < c){
				med = b;
				big = c;
			}
			else{
				med = c;
				big = b;
			}
		}
		else if(small == b){
			if(a < c){
				med = a;
				big = c;
			}
			else{
				med = c;
				big = a;
			}
		}
		else{
			if(a < b){
				med = a;
				big = b;
			}
			else{
				med = b;
				big = a;
			}
		}
		System.out.println("small-->" + small);
		System.out.println("mediun-->" + med);
		System.out.println("big-->" + big);
		if(Math.abs(small-med) == Math.abs(med-big)){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st number");
		int n1 = sc.nextInt();
		System.out.println("enter 2nd number");
		int n2 = sc.nextInt();
		System.out.println("enter 3rd number");
		int n3 = sc.nextInt();
		boolean result = evenlySpaced(n1,n2,n3);
		System.out.println(result);
	}

}
