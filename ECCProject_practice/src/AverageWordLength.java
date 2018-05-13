
public class AverageWordLength {

	public static void main(String[] args) {
		System.out.println(AverageWordLength.getAverageWordLength("Hi mom"));
		System.out.println(AverageWordLength.getAverageWordLength("hi everyone"));
		System.out.println(AverageWordLength.getAverageWordLength("how are you"));

	}

	public static int getAverageWordLength(String str) {
		if(str == null) {
			return -1;
		}
		if(str == "") {
			return 0;
		}
		int result = 0;
		String words[] = str.split(" ");
		String wordsConcat = "";
		str.trim();
		for(String x : words) {
			wordsConcat += x;
		}
		int charCount = wordsConcat.length();
		result = charCount/words.length;		
		return result;
	}
}