package ds.stack;

public class Stack {

	private int maxSize;
	private char[] theStack;
	private int top;

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.top = -1;
		this.theStack = new char[maxSize];
	}

	public boolean isEmpty() {
		return this.top == -1;
	}

	public boolean isFull() {
		return this.top == maxSize - 1;
	}
	
	public void push(char value) {
		if(isFull()) {
			try {
				throw new Exception("Stack is full!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			top++;
			theStack[top] = value;
		}
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return 'x';
		}else {
			int tmp = top;
			top--;
			return theStack[tmp];
		}
	}
	
	public char peek() {
		return theStack[top];
	}
}
