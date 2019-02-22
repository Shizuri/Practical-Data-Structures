package ds.singlyLinkedList;

public class SinglyLinkedList {

	private Node first;
	private Node last; //because of this it is no longer a Singly Linked List, it's now a Circular Linked List.
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insertFirst(int data) { //insert at the beginning of the list
		Node newNode = new Node();
		newNode.data = data;
		
		if(first == null) {
			last = newNode;
		}
			
		newNode.nextNode = first;
		first = newNode;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = first.nextNode;
		return temp;
	}
	
	public void displayList() {
		System.out.println("List (first --> last) ");
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.nextNode;
		}
		
		System.out.println();
	}
	
	public void insertLastOld(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		Node current = first;
		while(current != null) {
			if(current.nextNode == null) {
				current.nextNode = newNode;
				last = newNode;
				break;
			} else {
				current = current.nextNode;
			}
		}
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
			last = newNode;
		} else {
			last.nextNode = newNode;
			last = newNode;
		}

	}
	
	public void deleteLast() {
		Node current = first;
		while(current != null) {
			if(current.nextNode.nextNode == null) {
				current.nextNode = null;
				last = current;
//				break;
			}
			current = current.nextNode;
		}
	}
}
