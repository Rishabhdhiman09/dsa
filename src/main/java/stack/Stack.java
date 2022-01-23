package main.java.stack;

public class Stack {
	public int[] arr;
	public int topOfStack;
	
	public Stack(int size) {
		this.arr = new int[size];
		this.topOfStack = -1;
		System.out.println("Stack created with size " + size);
	}
	
	// is empty
	
	public boolean isEmpty() {
		return topOfStack == -1;
	}
	
	// is full
	public boolean isFull() {
		return arr.length == topOfStack + 1;
	}
	
	// push
	public void push(int value) {
		if (isFull()) {
			System.out.println("Stack is full");
		}else {
			arr[topOfStack + 1] = value;
			topOfStack++;
			System.out.println("New element added");
		}
	}
	
	// pop
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}else {
			int removed = arr[topOfStack];
			topOfStack--;
			return removed;
		}
	}
	
	// peek
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}else {
			return arr[topOfStack];
		}
	}
	
	// delete stack
	public void deleteStack() {
		arr  = null;
		System.out.println("Stack deleted");
	}
}
