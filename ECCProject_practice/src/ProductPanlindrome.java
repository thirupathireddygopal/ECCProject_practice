
public class ProductPanlindrome {

	public static void main(String[] args) {
		final int START = 10;
		final int END = 100;
		System.out.println(ProductPanlindrome.getCount(START, END));
	}

	public static int getCount(int start, int end) {
		int count = 0;
		int product  = 0;
		for(int i = start ; i <= end ; i++) {		
			for(int j = start ; j <= end ; j++) {
				System.out.println("the value of i,j is-------------------------->" + i + ","+j);
				product = i*j;
				System.out.println("product is-->" + product);
				if(reverse(product) == product) {
					System.out.println("count product is-------------------------->"+ product);
					count++;
				}
			}			
		}
		return count;
	}
	
	public static int reverse(int n) {
		int rem,rev = 0;
		while(n>0) {
		rem = n%10;
		rev = (rev*10) + rem;
		n = n/10;
		}
		System.out.println("reverse of the number is-->" + rev);
		return rev;
	}
}