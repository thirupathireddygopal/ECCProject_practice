public class NthTermQSequence {

	public static void main(String[] args) {
		System.out.println(NthTermQSequence.getNthTerm(10));
	}

	public static int getNthTerm(int n) {
		if(n <= 0) {
			return -1;
		}
		int result = 0;
		int presentValue = 0;
		for(int i = 1 ; i <= n ; i++) {
			presentValue += i;
			result = presentValue;
		}
		return result;	
	}
}