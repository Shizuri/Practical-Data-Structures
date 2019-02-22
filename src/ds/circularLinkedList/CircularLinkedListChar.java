package ds.circularLinkedList;

public class CircularLinkedListChar {

	private NodeChar first;
	private NodeChar last;
	
	public void insertFirst(char data) {
		NodeChar newNode = new NodeChar();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode;
		}
			
		newNode.nextNode = first;
		first = newNode;
	}
	
	public void insertLast(char data) {
		NodeChar newNode = new NodeChar();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
			last = newNode;
		} else {
			last.nextNode = newNode;
			last = newNode;
		}
	}
	
	public char deleteFirst() {
		NodeChar temp = first;
		first = first.nextNode;
		
		if(first.nextNode == null) {
			last = null;
		}
		
		return temp.data;
	}
	
	public char deleteLast() {
		if(isEmpty()) {
			System.out.println("List is empty!");
			return '!';
		} else {
			NodeChar current = first;
			char result = ' ';
			if(current.nextNode == null) {
				first = null;
				char tmp = current.data;
				current = null;
				return tmp;
			} else {
				while(current != null) {
					if(current.nextNode.nextNode == null) {
						result = current.nextNode.data;
						current.nextNode = null;
						last = current;
						
					}
					current = current.nextNode;
				}
				return result;
			}
			
		}
		
	}
	
	public void displayList() {
		System.out.println("List (first --> last) ");
		NodeChar current = first;
		while(current != null) {
			current.displayNode();
			current = current.nextNode;
		}
		
		System.out.println();
	}
	
	public boolean isEmpty() {
		return first == null;
	}
}
