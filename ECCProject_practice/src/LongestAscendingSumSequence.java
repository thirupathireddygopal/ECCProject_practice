
public class LongestAscendingSumSequence {

	public static void main(String[] ar) {
		int[] arr = { 1, 2, 3, 20, 3, 25, 30, 31, 32, 33, 34};
		System.out.println(getSum(arr));
		float[] brr = { 1.3f, 2.3f };
		System.out.println(getSum(brr));
		int[] crr = { 1, 2, 3, 20, 3, 25, 30, 31, 32, 33, 34,-2 };
		System.out.println(getSum(crr));
	
	}

	public static String getSum(Object obj) {
		try {
			int[] tObj = (int[]) obj;
			String result1 = "";
			String result2 = "";
			int sum1 = 0;
			int sum2 = 0;
			int temp = 0;
			int exitNum = 0;
			for(int i = 0 ; i < tObj.length-1 ; i++ ) {
				System.out.println("entered 1st for loop-->" + i);
				for(int j = i+1 ; j < tObj.length ; j++) {
						System.out.println("entered 2nd for loop-->" + j);
						
						if(tObj[j] <= 0) {
							return "-1";
						}
						
						if(tObj[j-1] < tObj[j]) {
							sum2 += tObj[j-1];
							result2 += tObj[j-1] + " ";
							System.out.println(result2);
							//System.out.println("sum-->" + sum2);
							exitNum = j;
						}				
						else if(tObj[j-1] > tObj[j]){
							sum2 += tObj[j-1];
							result2 += tObj[j-1] +" "+ sum2;
							//System.out.println(result2);
							temp = j-1;
							break;
						}
						if(j == (tObj.length-1)){						
							sum2 += tObj[j];						
							result2 += tObj[j] +" "+ sum2;
							//System.out.println(result2);						
						}					
				}			
				i = temp;
				System.out.println("the value of i=j(i value)-->" + i);			
				if(tObj[i] > tObj[i+1]) {     // i = j-1
					if(sum1 < sum2) {
						sum1 = sum2;
						//System.out.println("sum1-->" + sum1);
						result1 = result2;
					}				
					sum2 = 0;
					result2 = "";
				}
				if (sum1 > sum2){
					sum2 = 0;
					result2 = "";
					//System.out.println("printing result1-->" + result1);
				}
				if(exitNum == (tObj.length-1)) {
					break;
				}
			}
			if(sum1 < sum2) {
				//System.out.println("final sum1-->" + sum1);
				//System.out.println("final sum2-->" + sum2);
				//System.out.println("printing RESULT2");
				return result2;
			}
			else {
				//System.out.println("final sum1-->" + sum1);
				//System.out.println("final sum2-->" + sum2);
				//System.out.println("printing RESULT1");
				return result1;
			}			
		}catch(Exception refVar) {
			return "999";
		}		
	}
}