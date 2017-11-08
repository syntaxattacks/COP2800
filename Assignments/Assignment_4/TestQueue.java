public class TestQueue {
	
	/** Main method */
	public static void main(String[] args) {
		// Create a Queue object
		Queue queue0 = new Queue();

		// Adds 20 numbers from 1 to 20 into the queue
		for (int i = 1; i <= 20; i++) {
			queue0.enqueue(i);
		}

		// Removes these numbers and displays them
		while (!queue0.empty()) {
			System.out.print(queue0.dequeue() + " ");
		}
		System.out.println();
	}
}