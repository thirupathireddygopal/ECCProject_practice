package day.one;

import java.util.Scanner;

public class RearrangingArray {
	
	static int[] reverseArray(int arr[]) throws java.lang.Exception{
		int temp = 0;
		for(int i = 0; i < (arr.length)/2 ; i++) {
			temp = arr[i]+arr[arr.length - 1 - i];
			System.out.println("initial a-->" + temp);
			arr[arr.length-1-i] = temp-arr[arr.length-1-i];
			System.out.println("arr[arr.length-1]-->" + arr[arr.length-1-i]);
			arr[i] = temp-arr[i];
			System.out.println("final a-->" + arr[i]);
		}
		return arr;
	}

	public static void main(String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array of even length");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("array length-->" + arr.length);
		System.out.println("enter elements of array");
		for(int i = 0 ; i< n ; i++) {
			arr[i] = sc.nextInt();
		}		
		int[] result = reverseArray(arr);
		for(int i = 0 ; i < result.length ; i++)
		{
			System.out.println(result[i]);
		}
		sc.close();
	}
}
