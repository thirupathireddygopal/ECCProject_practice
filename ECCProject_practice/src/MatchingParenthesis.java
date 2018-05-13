public class MatchingParenthesis {

	public static void main(String[] args) {
		System.out.println(isMatchingParenthesis("(2+3)"));
		System.out.println(isMatchingParenthesis("((a + b) * c)"));
		System.out.println(isMatchingParenthesis("(a + b) * c)"));
		System.out.println(isMatchingParenthesis(")(a + b) * c))"));
	}

	public static boolean isMatchingParenthesis(String text) {
		if(text == null) {
			return false;
		}
		if(text == "") {
			return true;
		}
		int counter1 = 0 , counter2 = 0 ;
		for(int i = 0 ; i < text.length() ; i++) {
			if((text.charAt(i))=='(') {
				counter1++;
			}
			else if(text.charAt(i) == ')') {
				counter2++;
			}
		}
		if(counter1 == counter2) {
			return true;
		}
		return false;
	}

}