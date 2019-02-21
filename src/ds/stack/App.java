package ds.stack;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		String word = scanner.nextLine();
		String word = "Test";
		System.out.println(word);
		System.out.println("And now in reverse: ");
		System.out.println(reverseWord(word));
//		scanner.close();
		
		Stack s = new Stack(3);
		s.push('z');
		s.push('x');
		s.push('c');
		s.push('v'); // this will throw an exception
	}

	public static String reverseWord(String word) {
		Stack stack = new Stack(word.length());
		String result = "";
		for(int i = 0; i < word.length(); i++) {
			stack.push(word.charAt(i));
		}
		
		for(int i = 0; i < word.length(); i++) {
			result += stack.pop();
		}
		
		return result;
	}
}
