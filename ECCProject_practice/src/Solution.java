import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer");
		int n=sc.nextInt();

		String ans = "";
		if(n%2 == 1){
			System.out.println("n is odd");
			ans = "Weird";
		}
		else{
			if((n >= 1) || (n <= 100)){
				
				if(n % 2 == 0){
					if(n < 6){
						System.out.println("enterd 2-5");
						ans = "Not Weird";
					}                  
					else if(n <= 20){
						System.out.println("enterd 6-20");
						ans  = "Weird";
					}                   
					else if(n > 20){
						System.out.println("entered >20");
						ans = "Not Weird";
					}
				}
			}			
		}
		sc.close();
		System.out.println(ans);
	}
}