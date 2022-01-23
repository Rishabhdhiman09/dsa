package main.java.queue.circularque;

public class CircularQueue {
	int [] arr;
	int topOfQueue;
	int beginningOfQueue;
	int size;
	
	public CircularQueue(int size) {
		this.arr = new int[size];
		this.size = size;
		topOfQueue = -1;
		beginningOfQueue = -1;
		
		System.out.println("CQ is created");
	}
	
	// isEmpty
	public boolean isEmpty() {
		boolean result = false;
		if (topOfQueue == -1) {
			result = true;
		}
		return result;
	}
	
	
	// isFull
	public boolean isFull() {
		boolean result = false;
		if ((topOfQueue + 1) % size == beginningOfQueue) {
			result = true;
		}
		return result;
	}
	
	// enqueue
	
	public void enQueue(int value) {
		if (isFull()) {
			System.out.println("Que is full");
		}else if(isEmpty()) {
			topOfQueue++;
			arr[topOfQueue] = value;
			beginningOfQueue = 0;
		}else {
			topOfQueue++;
			arr[topOfQueue % size] = value;
		}
	}
	
	// deque
	public int deQueue() {
		if (isEmpty()) {
			System.out.println("Que is empty");
			return -1;
		}
		int value = arr[beginningOfQueue % size];
		beginningOfQueue++;
		if (beginningOfQueue > topOfQueue) {
			beginningOfQueue = -1;
			topOfQueue = -1;
		}
		
		return value;
		
	}
	
	// peek
	public int peek() {
		if (isEmpty()) {
			System.out.println("is empty");
			return -1;
			
		}
		return arr[beginningOfQueue % size];
	}
	
	// delete
	
	public void deleteQueue() {
		arr = null;
		System.out.println("Queue deleted successfully");
	}
	
	
}
