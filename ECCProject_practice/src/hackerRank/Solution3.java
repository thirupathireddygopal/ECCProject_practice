package hackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String result = "";
        for(int i=1 ; i<=10 ;i++){
            result += N + " x " + i + " = " + (N*i);
            result += "\n";
        }
        System.out.println(result);
    }
}