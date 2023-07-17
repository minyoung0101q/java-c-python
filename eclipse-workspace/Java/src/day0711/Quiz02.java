package day0711;

public class Quiz02 {
	static class Parent {
		void show() {
			System.out.println("Parent");
		}
	}
	
	static class Child extends Parent {
		void show() {
			System.out.println("Child");
		}
	}
	
	public static void main(String[] args) {
		Parent pa = new Child();
		pa.show();
	}
}
