import java.util.HashMap;
import java.util.Map;

public class MaxSpan {
	public static int findMaxFrequency(int[] arr) {
		try {
			int previousCounter = 0;
			int previousValue = 0;		
			for(int i = 0 ; i < arr.length-1 ; i++) {
				int presentCounter = 0;
				System.out.println("entered 1st for loop-->"+ i +" loop");
				for(int j = 0 ; j < arr.length ; j++) {
					System.out.println("entered 2nd for loop-->"+ j +" loop");
					
					if(arr[j] <= 0 ) {
						return -1;
					}
					
					if(arr[i] == arr[j]) {
						presentCounter++;
						System.out.println("presentCounter-->" + presentCounter);
					}				
				}
				
				if(presentCounter > previousCounter) {
					previousCounter = presentCounter;
					System.out.println("(presentCounter > previousCounter)=>"
							+ "previousCounter-->" + previousCounter);
					previousValue = arr[i];
					System.out.println("previousValue-->" + previousValue);
				}
				else if(presentCounter == previousCounter && previousValue < arr[i]) {
					previousValue = arr[i];
				}
			}
			return previousValue;
		}catch(Exception refVar){
			return 999;
		}
		
	}
	public static void main(String[] args) {
		int[] arr = { 1,1,1,1,1,1, 2, 2, 3,3,3,3 };
		System.out.println(findMaxFrequency(arr));
	}
}