package adt;

public class Main {

	public static void main(String[] args) {
		Counter c = new Counter("blah");
		
		System.out.println(c);
		c.increment();
		System.out.println(c.getCurrentValue());
	}
}
//adt = Abstract Data Type