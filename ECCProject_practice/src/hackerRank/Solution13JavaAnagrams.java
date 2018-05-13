package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

// java anagram [act,cat]
public class Solution13JavaAnagrams {
	
	static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] a1 = a.toLowerCase().toCharArray();
        char[] b1 = b.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        System.out.println("a1 after sorting-->" + String.valueOf(a1));
        System.out.println("b1 after sorting-->" + String.valueOf(b1));
        String sa1 = new String(a1);
        String sb1 = new String(b1);
        System.out.println("sa1-->" + sa1);
        if(sa1.equals(sb1)) {
        	return true;
        }
		return false;
    }

	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first string");
        String a = scan.next();
        System.out.println("enter second string");
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
