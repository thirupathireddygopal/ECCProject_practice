package hackerEarth;
import java.util.Scanner;

public class NumbersInRange6 {

	public static void main(String[] args) {
	    
	    
		Scanner s = new Scanner(System.in);
	    
	    // Get L and R from the input
		int L = s.nextInt();
		int R = s.nextInt();
    
        // Write here the logic to print all integers between L and R
        
        String result = "";
        for(int i = L ; i <= R ; i++){
            result += i + " ";
        }
        result = result.substring(0 , result.length()-1);
        System.out.println(result);
		s.close();
	}
}