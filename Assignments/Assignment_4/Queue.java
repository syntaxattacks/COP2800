/* 
 * Ian Hann
 * COP2800
 * Assignment 4
 * 11/14/2017
 * 
 */

/********************************************************
*                      Queue                            *
*-------------------------------------------------------*
* -elements: int[]                                      *
* -size: int                                            *
* +DEFAULT_SIZE: int                                    *
* ------------------------------------------------------*
* +Queue()                                              *
* +enqueue(v): int                                       *
* +dequeue(): int                                       *
* +empty(): boolean                                     *
* +getSize: int                                         *
********************************************************/

public class Queue {
	
	/* Data Fields */
	private int[] elements;
	private int size = 0;
	public static final int DEFAULT_SIZE = 8;
	
	
	/* Constructors */
	public Queue() { // No-arg constructor
		elements = new int[DEFAULT_SIZE];
	}
	
	public void enqueue(int v) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = v;
	}		
	
	
	public int dequeue() {
		int v = elements[0];
		int[] temp = new int[elements.length];
		System.arraycopy(elements, 1, temp, 0, size);
		elements = temp;
		size--;
		return v;		
	}
	
	public boolean empty() {
		return size == 0;		
	}
	
	public int getSize() {
		return size;		
	}
	
}