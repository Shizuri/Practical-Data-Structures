package ds.queue;

public class Queue {

	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;
	private long numberOfElements;
	
	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		this.front = 0;
		this.rear = -1;
		this.numberOfElements = 0;
	}
	
	public void insertElement(long element) {
		if(isFull()) {
			System.out.println("Queue is full!");
		} else {
			rear++;
			queueArray[rear] = element;
			numberOfElements++;
		}
	}
	
	public void removeElement() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			front++;
			numberOfElements--;
		}
	}
	
	public boolean isFull() {
		if(rear == maxSize - 1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(numberOfElements == 0) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String result = "Queue is: [ ";
		for(int i = front; i <= rear; i++) {
			result += queueArray[i] + " ";
		}
		result += "] number of elements is: " + numberOfElements + " front is: " + front + " rear is: " + rear;
		return result;
	}
}
