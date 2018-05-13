public class SumOfArrayDistinctElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 50};
        System.out.println(getSumOfDistinctElements(arr));
    }
    
    //return the sum of distinct elements of an given array
    public static int getSumOfDistinctElements(int[] arr) {
    	int result = 0;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]<0) {
        		return -1;
        	}
        	else if(arr[i]==0) {
        		return -2;
        	}
        	else{
        		if(isDublicate(arr,arr[i])==false) {
        			System.out.println("entered "+ i + " loop");
        			result += arr[i];
        		}        		
        	}
        }
        return result;
    }

    // return true if the val exist more than once in the array
    public static boolean isDublicate(int[] arr, int val) {
    	System.out.println("entered isDublicate block");
    	System.out.println("value is-->" + val);
    	int counter=0;
    	//System.out.println("value of k is: "+ k);
        for(int j=0;j<arr.length;j++) {
        	if(arr[j]==val) {
        		counter++;        		        		
        	}        	        	
        }
        if(counter>1) {
        	 System.out.println("counter > 1-->returning false");
             return false;
        }
        System.out.println("counter < 1-->returning true");
        return true;
    }
}
