package day.one;

import java.util.ArrayList;

public class StringsContainPattern {
	
	public static String[] getWordsContainsPattern(String str1[],String str2) {		
		ArrayList<String> arrayList = new ArrayList<String>();
		for(String x : str1) {
			if(x.toLowerCase().contains(str2)) {				
				//System.out.println("entered if loop");
				arrayList.add(x.toUpperCase());				
			}
		}
		
		String[] strArray = new String[arrayList.size()];
		strArray = arrayList.toArray(strArray);
		
		//String[] strArray = arrayList.toArray(new String[arrayList.size()]);
		System.out.println(strArray);
		return strArray;
	}
	
	public static void main(String[] args) {
		String[] words = {"South Africa", "Afghanistan", "Sri Lanka", "New Zealand",
				"West Indies", "England", "India", "Australia", "Pakistan", "Bangladesh"};
		String pattern = "an";
		String result[] = getWordsContainsPattern(words,pattern);
		System.out.println(result);
		for(String str : result) {
			System.out.println(str);
		}
		
	}

}
