package codingBat;

import java.util.Scanner;

public class CatDogCount {

	public static boolean catDog(String str) {
		int cat = 0;
		int dog = 0;
		String ss = "";
		for(int i = 0 ; i < str.length()-2 ; i++){
			ss = str.substring(i,i+3);
			System.out.println("ss-->" + ss);
			if(ss.equals("cat")){
				System.out.println("cat--");
				cat++;
			}
			if(ss.equals("dog")){
				System.out.println("dog--");
				dog++;
			}
		}
		if(cat == dog){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		boolean result = catDog(str);
		System.out.println(result);

	}

}
