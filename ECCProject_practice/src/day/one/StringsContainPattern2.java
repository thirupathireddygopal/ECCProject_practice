package day.one;

public class StringsContainPattern2 {
	
	public static String[] getWordsContainsPattern(String str1[],String str2) {		
		int arrLen = 0;
		for(String x : str1) {
			if(x.toLowerCase().contains(str2)) {
				arrLen++;			
			}
		}
		String[] str = new String[arrLen];
		arrLen = 0;
		for(String y : str1) {
			if(y.toLowerCase().contains(str2)) {
				str[arrLen] = y.toUpperCase();
				arrLen++;			
			}
		}		
		return str;
	}
	
	public static void main(String[] args) {
		String[] words = {"South Africa", "Afghanistan", "Sri Lanka", "New Zealand",
				"West Indies", "England", "India", "Australia", "Pakistan", "Bangladesh"};
		String pattern = "an";
		String result[] = getWordsContainsPattern(words,pattern);
		for(String y : result)
		System.out.println(y);
	}

}
