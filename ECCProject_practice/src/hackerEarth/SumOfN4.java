package hackerEarth;
import java.util.Scanner;

public class SumOfN4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the length of an array");
		int N = s.nextInt();
		
		// Define an array of integers of size N.
		//int[] a = new int[] {1,2,3,4};
		int[] numArray = new int[N];		
		

		int sum = 0;
		for(int i=0; i<N; i++){
			numArray[i] = s.nextInt(); // Get the input
		}
	    
	    // Write the logic to add these numbers here:
	    
	    for(int j = 0 ; j < numArray.length ; j++){
	        sum += numArray[j];
	    }
	    	    
		// Print the sum
		System.out.print(sum);
		s.close();
	}

}