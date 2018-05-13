package codingBat;

import java.util.Scanner;

public class StringX {
	
	public static String stringX(String str) {
		  String result = "";
		  if(str.charAt(0)=='x'){
		    result += 'x';
		  }
		  for(int i = 1 ; i < str.length()-2 ; i++){
		    if(str.charAt(i) == 'x'){
		      //do nothing
		    }
		    else{
		      result += str.charAt(i);
		    }
		  }
		  if(str.charAt(str.length()-1)=='x'){
		    result += 'x';
		  }
		  return result;
		}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		String result = stringX(str);
		System.out.println(result);

	}

}
