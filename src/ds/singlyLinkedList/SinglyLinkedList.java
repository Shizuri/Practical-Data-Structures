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
}
