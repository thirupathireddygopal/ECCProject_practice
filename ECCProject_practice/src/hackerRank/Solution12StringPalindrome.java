package hackerRank;
import java.io.*;
import java.util.*;

// string palindrome reverse [121,madam].
public class Solution12StringPalindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string to check for palindrome or not");
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String result = "";
        for(int i = A.length()-1 ; i >= 0 ;i--){
            result += A.charAt(i);
        }
        if(A.equals(result)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}