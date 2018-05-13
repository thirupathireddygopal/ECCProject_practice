public class SpinningString {

	public static void  main(String[] arg) {
		System.out.println(SpinningString.rotate("talent", 1));
		System.out.println(SpinningString.rotate("talent", 2));
		System.out.println(SpinningString.rotate("talent", 3));
		System.out.println(SpinningString.rotate("abc", 1));
		System.out.println(SpinningString.rotate("abc", 2));
		System.out.println(SpinningString.rotate("abc", 3));
	}

	public static String rotate(String str, int no_of_positions) {
		/*char[] charVar = new char[str.length()-1];
		for(int i = 0 ; i < str.length() ; i++) {
			charVar[i] = str.charAt(i);
		}*/
		if(str == null) {
			return null;
		}
		if(str == "") {
			return null;
		}
		if(no_of_positions <= 0) {
			return str;
		}
		if(no_of_positions > str.length()) {
			return str;
		}
		char temp = 0;
		char[] charVar = str.toCharArray();
		for(int i = 0 ; i < no_of_positions ; i++) {
			temp = charVar[charVar.length-1];
			for(int j = charVar.length-1 ; j > 0 ; j--) {
				charVar[j] = charVar[j-1];				
			}
			charVar[0] = temp;
			//System.out.println("charVar[0]-->" + charVar[0]);
		}
		//String str1 = charVar.toString();  //indicating the address
		String str2 = String.valueOf(charVar);
		//System.out.println("strVar is-->" + str2);
		return str2;
	}
}