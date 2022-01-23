package main.java.queue.circularque;

public class Main {
	public static void main(String[] args) {
		CircularQueue circularQueue = new CircularQueue(3);
		System.out.println(circularQueue.isEmpty());
		System.out.println(circularQueue.isFull());
		
		circularQueue.enQueue(10);
		circularQueue.enQueue(12);
		circularQueue.enQueue(13);
		
		circularQueue.deQueue();
		circularQueue.deQueue();
		circularQueue.enQueue(69);
		circularQueue.deQueue();
		
		
		System.out.println(circularQueue.peek());
	}
}
