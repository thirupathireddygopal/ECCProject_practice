package hackerRank;
import java.util.Scanner;
import java.util.regex.*;

/* 3
 * ([A-Z])(.+)
 * [AZ[a-z](a-z)
 * batcatpat(nat
 */
public class Solution15PatternSyntaxChecker
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.println("enter how many patterns to check");
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String pattern = in.nextLine();
             //Write your code
          try {
               Pattern.compile(pattern);
               System.out.println("Valid");
           } catch (PatternSyntaxException exception) {
               System.out.println("Invalid");
           }
          testCases--;
      }
       in.close();
   }
}