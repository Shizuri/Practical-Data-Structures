package ds.singlyLinkedList;

public class App {

	public static void main(String[] args) {

		SinglyLinkedList myList = new SinglyLinkedList();
		myList.insertLast(1);
		
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(99);
		myList.insertFirst(88);
		
		myList.insertLastOld(13);
		myList.insertLast(1300);
		myList.insertLast(9999);
		myList.deleteLast();
		
		myList.displayList();
	}

}
