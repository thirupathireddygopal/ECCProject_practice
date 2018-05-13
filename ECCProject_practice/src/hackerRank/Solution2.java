package hackerRank;
import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
            	System.out.println("enter 1st string");
            	String s1 = sc.next();
            	System.out.println("enter 1st space");
                int x = sc.nextInt();
                System.out.println("enter 1st integer");
                
                System.out.printf("%-14s %03d", s1, x);
                System.out.println();
                sc.close();
            }
            System.out.println("================================");

    }
}