
public class ReverseWords {

	public static void main(String[] args) {
		System.out.println(ReverseWords.reverse("talent sprint"));
		System.out.println(ReverseWords.reverse("abc efg"));
	}

	public static String reverse(String str) {
		if(str == "") {
			return null;
		}
		if(str == null) {
			return null;
		}
		String result = "";
		String a[] = str.split(" ");
		//System.out.println("the length of an Array is: " + a.length);		
		for(int i=0 ; i <= a.length-1 ; i++) {
			//System.out.println("enterd 1st loop");
			//System.out.println("a[0] value is: " + a[0]);
			for(int j = a[i].length()-1 ; j>=0 ; j--) {
				//System.out.println("entered 2nd loop");
				result += a[i].toLowerCase().charAt(j);
			}
			result += " ";
		}		
		return result;
	}

}