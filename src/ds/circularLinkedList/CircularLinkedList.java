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
	
	public int deleteLast() {
		if(isEmpty()) {
			System.out.println("List is empty!");
			return -1;
		} else {
			Node current = first;
			int result = -1;
			if(current.nextNode == null) {
				first = null;
				int tmp = current.data;
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
		
//		Node current = first;
//		while(current != null) {
//			if(current.nextNode.nextNode == null) {
//				current.nextNode = null;
//				last = current;
//				break;
//			}
//			current = current.nextNode;
//		}
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
