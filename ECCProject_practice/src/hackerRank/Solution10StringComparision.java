package hackerRank;
import java.io.*;
import java.util.*;

public class Solution10StringComparision {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string"); //hello
        String A=sc.next();
        System.out.println("enter second string"); //world
        String B=sc.next();
        System.out.println("A is" + A);
        int a = A.length();
        int b = B.length();
        int c = a+b;
        System.out.println("lenght of two strings is-->" + c);
        
        System.out.println(A.compareTo(B) < 0 ? "YES" : "NO"); //[(1-2) = -1(-ve) hello < world [h<w]] 
        if(A.compareTo(B) < 0) {
        	System.out.println(A);
        }
        else if(A.compareTo(B) > 0) {
        	System.out.println(B);
        }
        else {
        	System.out.println("they are identical to each other");
        }
    }
}