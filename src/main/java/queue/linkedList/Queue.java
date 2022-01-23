package main.java.queue.linkedList;

public class Queue {
	LinkedList list;
	
	public Queue() {
		list = new LinkedList();
		System.out.println("Queue created successfully");
	}
	
	// isEmpty
	public boolean isEmpty() {
		if (list.head == null) {
			return true;
		}
		return false;
	}
	
	// enQueue
	
	public void enQueue(int value) {
		list.insertInLinkedList(value, list.size);
	}
	
	
	// deQueue
	public int deQue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		int value = list.head.value;
		list.deletionOfNode(0);
		
		return value;
	}
	
	// peek
	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return list.head.value;
	}
	
	// delete queue
	public void delete() {
		list.deleteSLL();
	}
	
	
	
}
