package hackerRank;

import java.util.Scanner;

public class Solution7 {
	
	static Scanner sc = new Scanner(System.in);	
	static int B = sc.nextInt();	
	static int H = sc.nextInt();
	static boolean flag = true;
	static{
		System.out.println("enter breadth");
		System.out.println("enter height");
	     if(B <= 0 || H <= 0){
	         flag = false;
	         System.out.println("java.lang.Exception: Breadth and height must be positive");
	        }
	}

	public static void main(String[] args){
		
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class


