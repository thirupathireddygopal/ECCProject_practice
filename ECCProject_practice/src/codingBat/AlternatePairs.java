package codingBat;

import java.util.Scanner;

public class AlternatePairs {

	public static String altPairs(String str) {
		String result = "";
		int end = 0;
		for(int i = 0 ; i < str.length() ; i = i+4) {
			end = i+2;
			if(end > str.length()) {
				end = str.length();
			}
			result = result + str.substring(i, end);
		}
		return result;
	}	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		String result = altPairs(str);
		System.out.println(result);

	}

}
