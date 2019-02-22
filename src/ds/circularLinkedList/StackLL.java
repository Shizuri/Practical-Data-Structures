package ds.circularLinkedList;

public class StackLL {

//	private int maxSize;
	private CircularLinkedListChar list;
//	private int top;
	
	public StackLL() {
//		this.maxSize = size;
		this.list = new CircularLinkedListChar();
//		this.top = -1;
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public void push(char data) {
		list.insertLast(data);
//		top++;
	}
	
	public char pop() {
		char result = list.deleteLast();
		return result;
//		top--;
	}
}
