public class RoundedSum {
	public static void main(String[] args) {
		int a = 20, b = 30, c = 40;
		System.out.println(sumOfRoundedValues(a, b, c));
	}

	public static int sumOfRoundedValues(int n1, int n2, int n3) {
		int result = 0;
		if(n1 <= 0 || n2 <= 0 || n3 <= 0) {
			return -1;
		}		
		if(n1%10 < 5) {
			result += (n1/10)*10;
		}
		else {
			result += (n1/10)*10 + 10;
		}
		if(n2%10 < 5) {
			result += (n2/10)*10;
		}
		else {
			result += (n2/10)*10 + 10;
		}
		if(n3%10 < 5) {
			result += (n3/10)*10;
		}
		else {
			result += (n3/10)*10 + 10;
		}
		return result;
	}
}