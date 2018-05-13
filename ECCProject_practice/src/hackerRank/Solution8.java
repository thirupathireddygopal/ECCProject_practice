package hackerRank;

import java.util.*;
import java.time.*;

public class Solution8 {

	public static String getDay(int day, int month, int year) {
		LocalDate dt = LocalDate.of(year, month, day);
		System.out.print(dt.getDayOfWeek());
		return String.valueOf(dt.getDayOfWeek());

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter month");
		int month = in.nextInt();
		
		System.out.println("enter day");
		int day = in.nextInt();
		
		System.out.println("enter year");
		int year = in.nextInt();

		System.out.println(getDay(day, month, year));
	}

}
