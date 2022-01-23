package main.java.queue;

public class QueueArray {
	private int[] arr;
	private int beginningOfQueue;
	private int topOfQueue;
	
	public QueueArray(int size) {
		arr = new int[5];
		beginningOfQueue = -1;
		topOfQueue = -1;
		System.out.println("Queue created successfully");
	}
	
	public boolean isFull() {
		if (topOfQueue == arr.length - 1) {
			return true;
		}
		return false;
	}
	
	// is Empty
	
	public boolean isEmpty() {
		if (beginningOfQueue == -1 || beginningOfQueue == arr.length) { // beginningOfQueue == arr.length not required
			return true;
		}
		return false;
	}
	
	// enqueue
	
	public void enqueue(int element) {
		if (isFull()) {
			System.out.println("Que is full");
		}else if (isEmpty()) {
			beginningOfQueue = 0;
			topOfQueue++;
			arr[topOfQueue] = element;
		}else {
			topOfQueue++;
			arr[topOfQueue] = element;
		}
	}
	
	// dequeue
	
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		else {
			int element = arr[beginningOfQueue];
			beginningOfQueue++;
			
			if (beginningOfQueue > topOfQueue) {
				beginningOfQueue = topOfQueue = -1;
			}
			return element;
		}
	}
	
	// peek
	
	public int peek() {
		if (!isEmpty()) {
			return arr[beginningOfQueue];
		}
		return -1;
	}
	
	public void deleteQueue() {
		arr = null;
		System.out.println("Queue is deleted");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
