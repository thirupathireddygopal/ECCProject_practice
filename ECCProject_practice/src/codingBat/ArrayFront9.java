package codingBat;

public class ArrayFront9 {

	public static boolean array9(int nums[]) {
		for(int i = 0 ; i < nums.length ; i++){
		    if(nums[i] == 9){
		      return true;
		    }
		    System.out.println(nums[i]);
		  }
		  return false;
	}
	
	public static void main(String[] args) {		
		//int [] nums = {1, 2, 3, 4, 9};
		int[] nums = new int[] {1, 2, 3, 4, 9};
		boolean result = array9(nums);
		System.out.println(result);
	}

}
