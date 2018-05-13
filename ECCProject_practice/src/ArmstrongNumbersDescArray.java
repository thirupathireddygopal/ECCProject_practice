import java.util.LinkedList;
import java.util.List;

public class ArmstrongNumbersDescArray {
	
	public static List<Integer> armstrongNumbersDescArray(int num1,int num2) {
		List<Integer> list = new LinkedList<Integer>();
		for(int i = num1 ; i <= num2 ; i++) {
			if(armstrongNumber(i)) {
				list.add(i);
			}
		}		
		return list;
	}
	
	public static boolean armstrongNumber(int num) {
		if(num == sumOfPowersOfDigits(num)) {
			return true;
		}
		return false;
	}
	
	public static int sumOfPowersOfDigits(int n) {
		int sum = 0;
		int[] arr = getDigits(n);
		for(int i = 0 ; i < arr.length ; i++) {
			sum += power(arr[i] , arr.length);
			//System.out.println("sum is-->" + sum);
		}
		return sum;
	}
	
	public static int[] getDigits(int n) {
		int countDigits = 0;
		int temp = n;
		while(temp > 0) {
			temp = temp/10;
			countDigits++;
		}
		int[] arr = new int[countDigits];
		int rem , i = 0;		
		while(n > 0) {
			rem = n % 10;
			arr[i] = rem;
			//System.out.println("a[i]-->" + arr[i]);
			n = n/10;
			i++;
		}
		return arr;
	}
	
	public static int power(int base , int power) {
		int result = (int) Math.pow(base, power);
		return result;
	}

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 1999;
		System.out.println(armstrongNumbersDescArray(num1,num2));
	}

}
