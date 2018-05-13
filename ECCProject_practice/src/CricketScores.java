public class CricketScores {

	public static String getDisplayDetails(int runs, float overs) {
		String result = "";
		if(runs < 100) {
			result += runs + " runs in " +(overs/10)*6; 
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(CricketScores.getDisplayDetails(30, 2.1f));
	}
}