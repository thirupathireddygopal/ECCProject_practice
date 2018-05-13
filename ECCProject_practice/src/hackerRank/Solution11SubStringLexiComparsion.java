package hackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution11SubStringLexiComparsion {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        System.out.println("empty string-->" + smallest);
        String largest = "";
        System.out.println("the lenght of s.length()-->" + s.length());
        System.out.println("the lenght of [s.lenght()-k]-->" + (s.length()-k));
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i = 0 ; i <= s.length()-k ; i++) {
        	String subString = s.substring(i, i+k);
        	if(i == 0) {
        		smallest = subString;
        	}
        	if(subString.compareTo(smallest) < 0) {
        		smallest = subString;
        	}
        	else if(subString.compareTo(largest) > 0) {
        		largest = subString;
        	}
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string to get the smallest and largest substrings");
        String s = scan.next();
        System.out.println("enter substring length");
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}