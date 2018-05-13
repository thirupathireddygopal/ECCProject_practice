public class Fibonacci_NthTerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getNthTermOfFibonacciSeries(10));
	}

	public static int getNthTermOfFibonacciSeries(int nthTerm) {
		if(nthTerm <= 0) {
			return -1;
		}
		if(nthTerm == 1) {
			return 0;
		}
		else if(nthTerm == 2) {
			return 1;
		}
		String str = "0,1";
		int first = 0;
		int second = 1;		
		int next = 0;
		int temp,count = 0;
		for(int i = 0 ; i < nthTerm-2 ;i++) {
			temp = second;
			next = second + first;
			second = next;
			first = temp;
			count = next;
			str += "," + next;
			//System.out.println(str);
		}
		return count;
	}

}