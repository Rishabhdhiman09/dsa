package main.java.stack.linkedList;

public class Stack {
	LinkedList linkedList;
	public Stack() {
		linkedList = new LinkedList();
	}
	public void push(int value) {
		linkedList.insertInLinkedList(value, 0);
		System.out.println("Inserted value " + value);
		
	}
	
	public int peek(int value) {
		return linkedList.head.value;
		
	}
	
	public void pop() {
		linkedList.deletionOfNode(0);
		
	}
	
	public void deleteStack() {
		linkedList.deleteSLL();
		
	}
	
	public boolean isEmpty() {
		if (linkedList.head == null) {
			return true;
		}return false;
		
	}
}
