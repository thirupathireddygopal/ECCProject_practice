import java.util.*;
public class AddingTime {
	
	public static String displayFinalTime(String initial , int seconds) {
		String result = "";
		int hours = 0 , min = 0 ,sec = 0;
		String a[] = initial.split(":");
		if(seconds/60 > 0) {
			min = Integer.parseInt(a[1]) + seconds/60;
			sec = Integer.parseInt(a[2]) + seconds%60;
		}
		else {
			sec = Integer.parseInt(a[2])+seconds;
			if(sec == 60) {
				min = Integer.parseInt(a[1])+1;
				System.out.println("initial min-->" + min);
				sec = 0;
			}
		}
		if( min/60 > 0) {
			hours = Integer.parseInt(a[0]) + min/60;
			System.out.println("finalhours-->"+hours);
			min =  min%60;
			System.out.println("finalmin-->"+min);
		}
		else {
			hours = Integer.parseInt(a[0]);
		}
		result = "" + hours + ":" + min + ":" + sec;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter intial time in HH:MM:SS");
		String initalTime = sc.nextLine();
		System.out.println("inital time is-->" + initalTime);
		System.out.println("enter seconds to add to the initial time");
		int sec = sc.nextInt();
		String finalTime = displayFinalTime(initalTime,sec);
		System.out.println("the final time is-->"+ finalTime);
		sc.close();
	}

}
