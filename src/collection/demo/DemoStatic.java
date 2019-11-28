package collection.demo;

public class DemoStatic {

	static {
		System.out.println("Static block1 called");
	}

	public static void main(String[] args) {
		System.out.println("main method called");
	}

	static {
		System.out.println("Static block2 called");
	}
}
