package hackerRank;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter integer");
        int i = scan.nextInt();        
        System.out.println("enter double");
        double d = scan.nextDouble();
        
        //important it requires line feed
        scan.nextLine();
        
        System.out.println("enter string");
        String s = scan.nextLine();
        scan.close();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}