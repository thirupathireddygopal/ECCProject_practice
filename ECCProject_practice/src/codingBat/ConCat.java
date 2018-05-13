package codingBat;

import java.util.Scanner;

public class ConCat {

	public static String conCat(String a, String b) {
		String result = "";
		if(a.length() == 0 || b.length() == 0){
			result = a + b;
		}
		if(a.length() > 1 && b.length() > 1){
			if(a.charAt(a.length()-1) == b.charAt(0)){
				result = a + b.substring(1,b.length());
			}
			else{
				result = a+b;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String a = sc.nextLine();
		System.out.println("enter another string");
		String b = sc.nextLine();
		String result = conCat(a,b);
		System.out.println(result);

	}

}
