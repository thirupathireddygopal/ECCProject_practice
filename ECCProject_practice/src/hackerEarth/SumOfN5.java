package hackerEarth;
import java.util.Scanner;

public class SumOfN5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the length of an array");
		int N = s.nextInt();
		
		// Define an array of integers of size N. 
		int[] numArray = new int[N];		
		

		int sum = 0;
		for(int i=0; i<N; i++){
			System.out.println("enter an integer");
			numArray[i] = s.nextInt(); // Get the input
		}
	    
	    // Write the logic to add these numbers here:
	    for(int j = 0 ; j < numArray.length ; j++){
	        sum += Math.pow(numArray[j],2);
	    }
	    
	    // Print the sum
		System.out.print(sum);
		s.close();
	}

}