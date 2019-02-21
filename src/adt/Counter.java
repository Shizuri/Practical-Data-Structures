package adt;

public class Counter {

	private String name;
	private int number;

	public Counter(String str) {
		name = str;
	}

	public void increment() {
		number++;
	}

	public int getCurrentValue() {
		return number;
	}

	@Override
	public String toString() {
		return "Counter [name=" + name + ", number=" + number + "]";
	}

}
//adt = Abstract Data Type