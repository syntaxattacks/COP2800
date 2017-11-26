import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Create ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// Prompt the user to enter 5 numbers
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}
		
		// Sort numbers
		java.util.Collections.sort(list);
					
		// Display list in increasing order
		System.out.println(list.toString());

		// Sort numbers in reverse order
		Collections.sort(list, Collections.reverseOrder());
		
		// Display list in decreasing order
		System.out.println(list.toString());
					
		input.close();		
		


	}

//	public static void otherWay(ArrayList<Integer> list){
//		for(int i = 0; i< list.size; i++) {
//			int currentMin = list.get(i);
//			int currentIndex = i;
//			
//			for (int j = i + 1; j < list.size(); j++) {
//				if (currentMin > list.get(i)) {
//					currentMin = list.get(i);
//					currentIndex = j;
//				} // End If
//			} // End nested for
//			
//			if (currentIndex != i) {
//				list.set(currentIndex,  list.get(i));
//				list.set(i, currentMin);
//			} // End If
//			
//		} // End for
//	} // End otherWay
//	
//	/** Sorts an ArrayList of Integers */
//	public static void sort(ArrayList<Integer> list) {
//		java.util.Collections.sort(list);		
//	}
	

	
}



