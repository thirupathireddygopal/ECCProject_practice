package codingBat;

import java.util.Scanner;
// [abc.xxy] ,[1.xyz.xyz2.xyz],[xyz.abc]
public class XyzThere {

	public static boolean xyzThere(String str) {
		if(str.length() > 3){
			for(int i = 0 ; i < str.length()-3 ; i++){
				System.out.println("i value-->" + i);
				if(str.charAt(i) != '.') {
					if(i == 0) {
						if(str.substring(i,i+3).equals("xyz")){
							return true;
						}
					}					
					if(str.substring(i+1,i+4).equals("xyz")) {
						return true;
					}
				}
				else if(str.charAt(i) == '.') {
					System.out.println(". value-->" + i);
					System.out.println("entered . con--");
					if(i == str.length()-4) {
						return false;
					}
				}
			}
		}
		else{
			if(str.equals("xyz")){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		boolean result = xyzThere(str);
		System.out.println(result);
	}

}
