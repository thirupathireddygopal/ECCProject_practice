package codingBat;

import java.util.Scanner;

public class MixString {

	public static String mixString(String a, String b) {
		String result = "";
		if(a.length() < b.length()){
			System.out.println("b is big");
			for(int i = 0 ; i < b.length() ; i++){
				if( i <= a.length()-1){
					result += a.charAt(i)+""+b.charAt(i);
					System.out.println(result);
				}
				else{
					result += b.substring(i,b.length());
					break;
				}
			}
		}
		if(a.length() > b.length()){
			System.out.println("a is big");
			for(int i = 0 ; i < a.length() ; i++){
				if( i <= b.length()-1){
					result += a.charAt(i)+""+b.charAt(i);
				}
				else{
					result += a.substring(i,a.length());
					break;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		String a = sc.nextLine();
		System.out.println("enter second string");
		String b = sc.nextLine();
		String result = mixString(a,b);
		System.out.println(result);
	}

}
