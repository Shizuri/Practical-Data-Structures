package ds.circularLinkedList;

public class App {
	public static void main(String[] args) {

		CircularLinkedList myList = new CircularLinkedList();
		
		myList.deleteLast();
		
		myList.insertLast(1);
		myList.deleteLast();
		myList.insertLast(1);
		
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(99);
		myList.insertFirst(88);
		
		myList.insertLast(1300);
		myList.insertLast(9999);
		
		myList.deleteFirst();
		
		myList.displayList();
		
		CircularLinkedListChar myCharList = new CircularLinkedListChar();
		myCharList.insertLast('h');
		myCharList.insertLast('e');
		myCharList.insertLast('l');
		myCharList.insertLast('l');
		myCharList.insertLast('o');
		myCharList.displayList();
		
		System.out.println("------------------------");
		
		StackLL stack1 = new StackLL();
		stack1.push('z');
		stack1.push('d');
		stack1.push('r');
		
		System.out.println(stack1.isEmpty());
		
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		
		System.out.println(stack1.isEmpty());
	}
	
//	public static String reverseWord(String word) {
//		StackLL stack = new StackLL();
//		
//	}

}
