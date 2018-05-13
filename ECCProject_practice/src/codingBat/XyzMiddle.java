package codingBat;

import java.util.Scanner;

public class XyzMiddle {

	public static boolean xyzMiddle(String str) {
		if(str.length() >= 5){
			  int pre = str.indexOf('x');
			  System.out.println("pre-->"+pre);
			  int suf = str.indexOf('z');
			  System.out.println("suf-->"+suf);
			  int first = pre;
			  System.out.println("first-->" + first);
			  int last = str.length()-1-suf;
			  System.out.println("last-->" + last);
			  if(first <= last){
			    return true;
			  }
			  }
			  return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		boolean result = xyzMiddle(str);
		System.out.println(result);
	}

}
