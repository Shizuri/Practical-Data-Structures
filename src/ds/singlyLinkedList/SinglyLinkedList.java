package ds.singlyLinkedList;

public class SinglyLinkedList {

	private Node first;
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insertFirst(int data) { //insert at the beggining of the list
		Node newNode = new Node();
		newNode.data = data;
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
}
