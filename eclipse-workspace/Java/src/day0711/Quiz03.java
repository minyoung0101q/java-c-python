package day0711;

public class Quiz03 {
	static class A {
		int a;
		
		A(int a) {
			this.a = a;
		}
		
		void display() {
			System.out.println("a=" + a);
		}
	}
	
	static class B extends A {
		B(int a) {
			super(a);
			super.display();
		}
	}
	public static void main(String[] args) {
		B obj = new B(10);
	}
}
