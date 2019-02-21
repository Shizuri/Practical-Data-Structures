package ds.queue;

public class App {

	public static void main(String[] args) {
		
		Queue queue1 = new Queue(3);
		
		System.out.println(queue1);

		queue1.insertElement(13);
		queue1.insertElement(2);
		queue1.insertElement(120);
		
		System.out.println(queue1);
		
		queue1.removeElement();
		queue1.removeElement();
		
		System.out.println(queue1);
		
		queue1.insertElement(1);
		
		System.out.println(queue1);
	}

}
