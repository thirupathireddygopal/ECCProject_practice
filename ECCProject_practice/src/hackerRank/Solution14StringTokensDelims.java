package hackerRank;
import java.io.*;
import java.util.*;

// java string token
public class Solution14StringTokensDelims {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string"); //He is a very very good boy, isn't he?
        String s = scan.nextLine();
        String delims = "[ _@ !,?.'\b\t\n\f\r\"]+" ;
        String[] words = s.split(delims);
        String tokenResult = "";
        int count = 0;
        String result = "";
        for(int i = 0 ; i < words.length ; i++){
        	if(words[i].contains(delims)) {
        		//do nothing
        	}else {
        		count += 1;
        		tokenResult += words[i] + "\n";
        	}
        	result = count + "\n" + tokenResult;
        }
        System.out.println(result);
        scan.close();
    }
}