package hackerEarth;
import java.util.Scanner;

public class AddTwoArrays7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the array length");
		// Reading integer from input
		int N = s.nextInt();
		
		int[] numArrayA = new int[N];
		int[] numArrayB = new int[N];
		int[] sumArray = new int[N];
				
		// Read numArray1
		for(int i=0; i<N; i++) {
			System.out.println("enter interger for 1 array");
			numArrayA[i] = s.nextInt();
		}
		// Read numArray2
		for(int i=0; i<N; i++) {
			System.out.println("enter integer for 2 array");
			numArrayB[i] = s.nextInt();
		}
		
		// Write your logic here:
		for(int i = 0 ; i < N ; i++){
		    sumArray[i] = numArrayA[i] + numArrayB[i];
		}
		
		
		
		
		// Print the sumArray
		for(int i=0; i<N; i++) {
			System.out.print(sumArray[i] + " ");
		}
        
        System.out.println();
		s.close();

	}

}