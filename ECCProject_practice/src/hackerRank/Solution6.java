package hackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while(sc.hasNext()){          // sc.hasNext() == true
            String nl = sc.nextLine();
            System.out.println(count + " " + nl);
            count++;
        }
    }
}