package ds.circularLinkedList;

public class App {
	public static void main(String[] args) {

		CircularLinkedList myList = new CircularLinkedList();
		myList.insertLast(1);
		
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(99);
		myList.insertFirst(88);
		
		myList.insertLast(1300);
		myList.insertLast(9999);
		myList.deleteFirst();
		
		myList.displayList();
	}

}
