package hackerRank;
import java.util.*;
import java.io.*;

class Solution4{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            String result = "";
            int total = a;            
            if((a>=0) && (b < 51) && ((n > 0)||(n < 15)) ){
                    for(int j = 0 ; j < n ; j++){
                        total += Math.pow(2,j)*b;
                        result += total + " ";
                    }                    
                }
            System.out.println(result);
        }
        in.close();
    }
}