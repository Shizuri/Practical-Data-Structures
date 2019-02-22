package ds.circularLinkedList;

import ds.singlyLinkedList.Node;

public class CircularLinkedList {

	private Node first;
	private Node last;
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode;
		}
			
		newNode.nextNode = first;
		first = newNode;
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
	
	public int deleteFirst() {
		Node temp = first;
		first = first.nextNode;
		
		if(first.nextNode == null) {
			last = null;
		}
		
		return temp.data;
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
	
	public boolean isEmpty() {
		return first == null;
	}
}
