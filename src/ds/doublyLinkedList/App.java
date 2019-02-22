package ds.doublyLinkedList;

public class App {

	public static void main(String[] args) {

		DoublyLinkedList list = new DoublyLinkedList();
		
		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		list.insertLast(100);
		list.insertLast(200);
		list.insertLast(300);
		
		list.printList();
		
		
	}

}
