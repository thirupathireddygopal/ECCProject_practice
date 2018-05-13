package hackerRank;
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;


/*3
	uncle sam
	99912222
	tom
	11122222
	harry
	12299933
	uncle sam
	uncle tom
harry*/
class Solution19Map{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("the number of entries of the phone book");
		int n=in.nextInt();
		in.nextLine();
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		for(int i=0;i<n;i++){
			System.out.println("enter the name of person");
			String name=in.nextLine();
			System.out.println("enter phone number");
			int phone=in.nextInt();
			hmap.put(name, phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
			try {
				int temp = hmap.get(s);
				System.out.println(s + "=" + temp);
				
			}catch(NullPointerException e) {
				System.out.println("user not found");
			}
		}
	}
}