package hackerRank;

import java.util.*;
import java.math.*;

public class Solution17BigIntegerPrimeTest {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter integer");
      BigInteger n = sc.nextBigInteger();
      sc.close();
      // Write your code here.
      System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");
   }
}