package hackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Java Big Integer
public class Solution16BigInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter first BigInteger");
        BigInteger bi1 = sc.nextBigInteger();
        System.out.println("enter another Biginteger");
        BigInteger bi2 = sc.nextBigInteger();
        
        BigInteger bi3,bi4;
        
        bi3 = bi1.add(bi2);
        bi4 = bi1.multiply(bi2);
        System.out.println("bi3-->" + bi3);
        System.out.println("bi4-->" + bi4);
    }
}