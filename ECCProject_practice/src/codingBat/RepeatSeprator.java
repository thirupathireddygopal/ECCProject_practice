package codingBat;

import java.util.Scanner;

public class RepeatSeprator {
	
	public static String repeatSeperator(String word,String sep,int count) {
		String result = word;
		  for(int i = 0 ; i < count-1 ; i++){
		    result += sep + word; 
		  }
		  if(count == 0){
		    result = word;
		  }
		  return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
		String word = sc.nextLine();
		System.out.println("enter the seperator");
		String sep = sc.nextLine();
		System.out.println("enter the count");
		int count = sc.nextInt();
		String result = repeatSeperator(word,sep,count);
		System.out.println(result);

	}

}
