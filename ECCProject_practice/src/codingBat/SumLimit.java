package codingBat;

import java.util.Scanner;

public class SumLimit {

	public static int addLimit(int a, int b) {
		  int c = a+b;
		  String str1 = String.valueOf(a);
		  System.out.println("str1 length-->" + str1.length());
		  String str2 = String.valueOf(c);
		  System.out.println("str2-->" + str2);
		  System.out.println("str2 length-->" + str2.length());
		  if(str2.length() > str1.length()){
		    return a;
		  }
		  else
		  return c;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int n1 = sc.nextInt();
		System.out.println("enter second number");
		int n2 = sc.nextInt();
		int result = addLimit(n1,n2);
		System.out.println(result);
	}

}
