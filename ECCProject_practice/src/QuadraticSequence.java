public class QuadraticSequence {

	public static void main(String[] args) {
		System.out.println(QuadraticSequence.getQuadricSequence(10));
	}

	public static String getQuadricSequence(int n) {
		if(n <= 0) {
			return null;
		}
		String result = "";
		int presentValue = 0;
		for(int i = 1 ; i <= n ; i++) {
			presentValue += i;
			result += presentValue + ",";
		}
		result = result.substring(0, result.length()-1);
		return result;
	}

}