package codingBat;

import java.util.Scanner;

public class EveryNthTerm {

	public static String everyNth(String str, int n) {
		String result = "";
		if(str.length() > 0){
			result += str.charAt(0);
		}
		for(int i = 0 ; i <= str.length()-1 ; i++){
			result += str.charAt(i+n);
			System.out.println(result);
			if(i <= str.length()) {
				i = i+n-1;
				System.out.println("i-->" + i);
			}		    
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		System.out.println("enter the Nth term");
		int n = sc.nextInt();
		String result = everyNth(str,n);
		System.out.println(result);
	}

}
