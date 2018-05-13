public class SixthStarPattern {
	public static String getStars(int n){
		if(n<=0) {
			return "Error";
		}
		String result = "";
		for(int i=1 ; i<=(2*n-1) ; i++) {		
			if(i<=n) {				
				for(int j=1;j<=i;j++) {					
					result += "*";
				}
				result += "\n";
			}			
			if(i>n) {				
				for(int j=1;j<=i-2*(i%10);j++) {
					result += "*";
				}
				if(i==2*n-1) {
					// do nothing
				}
				else {
					result += "\n";
				}
			}		
		}	
		return result;
	}
	public static void main(String[] args) {
		// TEST YOUR CODE HERE
		System.out.println(getStars(10));
	}
}
