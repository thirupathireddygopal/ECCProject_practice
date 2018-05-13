package codingBat;

import java.util.Scanner;

public class WithoutX2 {

	public static String withoutX2(String str) {
		String result = "";
		
		if(str.charAt(0) == 'x'){
			//do nothing
		}
		else{
			System.out.println("entered 1st");
			result += str.substring(0,1);
			System.out.println("1st-->" + result);
		}
		if(str.charAt(1) == 'x'){
			// do nothing
		}
		else{
			System.out.println("entered 2nd");
			result += str.substring(1,2);
			System.out.println("2nd-->" + result);
		}
		if(str.length() > 2) {
		result += str.substring(2,str.length());
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		String result = withoutX2(str);
		System.out.println(result);
	}
}
