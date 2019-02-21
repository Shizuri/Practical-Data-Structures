package ds.linkedlists;

public class App {

	public static void main(String[] args) {

		Node nodeA = new Node();
		nodeA.data = 4;
		
		Node nodeB = new Node();
		nodeB.data = 3;
		
		Node nodeC = new Node();
		nodeC.data = 7;
		
		Node nodeD = new Node();
		nodeD.data = 8;
		
		nodeA.nextNode = nodeB;
		nodeB.nextNode = nodeC;
		nodeC.nextNode = nodeD;
		
		System.out.println(listLength(nodeA)); //4
		System.out.println(listLength(nodeB)); //3
		System.out.println(listLength(nodeD)); //0
		
		System.out.println("Now with \"while\"");
		
		System.out.println(listLengthWithWhile(nodeA)); //4
		System.out.println(listLengthWithWhile(nodeB)); //3
		System.out.println(listLengthWithWhile(nodeD)); //0
	}
	
	public static int listLength(Node aNode) {
		if(aNode.nextNode == null) {
			return 1;
		} else {
			return listLength(aNode.nextNode) + 1;
		}
	}
	
	public static int listLengthWithWhile(Node aNode) {

		int length = 0;
		Node tmp = aNode;
		while(tmp != null) {
			length++;
			tmp = tmp.nextNode;
		}
		return length;
	}
}
