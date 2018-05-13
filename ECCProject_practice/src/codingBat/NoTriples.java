package codingBat;

import java.util.Scanner;

public class NoTriples {

	public static boolean noTriples(int[] nums) {
		  boolean triples = false;
		  for(int i = 0 ; i < nums.length ; i++){
		    if(i+2 < nums.length){
		      if((nums[i] == nums[i+1]) && (nums[i+1] == nums[i+2])){
		        return true;
		      }
		    }
		  }
		  return triples;
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of an array");
		int len = sc.nextInt();
		int[] a = new int[len];
		for(int i = 0 ; i < len ; i++) {
			System.out.println("enter the array values");
			a[i] = sc.nextInt();
		}
		
		boolean result = noTriples(a);
		System.out.println(result);

	}

}
