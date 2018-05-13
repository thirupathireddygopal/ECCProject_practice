import java.util.Scanner;

public class AreaOfRectangle {
	
	public static int rectangleArea(int len,int bre) {
		int result = 0;
		result = len*bre;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of rectangle");
		int lenght = sc.nextInt();
		System.out.println("enter breadth of rectangle");
		int breadth = sc.nextInt();
		int result = rectangleArea(lenght,breadth);
		System.out.println("the area of rectangle is-->" + result);
	}

}
