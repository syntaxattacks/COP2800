/* 
 * Ian Hann
 * COP2800
 * Assignment 4
 * 11/14/2017
 * 
 */

public class TestQueue {
	
	/* Main method */
	public static void main(String[] args) {
		
		// Create a Queue object
		Queue queue0 = new Queue();

		// Add 1-20 into the queue
		for (int count = 1; count <= 20; count++) {
			queue0.enqueue(count);
		}

		// Remove the numbers from the queue and display them
		while (!queue0.empty()) {
			System.out.print(queue0.dequeue() + " ");
		}
		
	}
}