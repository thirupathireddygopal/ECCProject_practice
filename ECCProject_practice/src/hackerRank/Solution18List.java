package hackerRank;

import java.util.LinkedList;
import java.util.Scanner;


/*5
	12 0 1 78 12
	2
	Insert
	5 23
	Delete
0*/
public class Solution18List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of elements in linked list");
		/* Create and fill Linked List of Integers */
		int n = sc.nextInt();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		for(int i = 1 ; i <= n ; i++) {
			System.out.println("values of linked list");
			int value = sc.nextInt();
			linkedList.add(value);
		}
		// perform queries on the linked list
		System.out.println("enter querie wheather Insert or Delete");
		String querie = sc.next();
		if(querie.equals("Insert")) {
			System.out.println("enter index number");
			int index = sc.nextInt();
			System.out.println("enter value of index");
			int value = sc.nextInt();
			linkedList.add(index, value);
		}else {
			// Delete
			System.out.println("enter the index nuumber to delete the value from linked list");
			int i = sc.nextInt();
			linkedList.remove(i);
		}
		sc.close();
		
		// printing the values of linked list
		for(Integer i : linkedList) {
			System.out.print(i + " ");
		}
	}

}
