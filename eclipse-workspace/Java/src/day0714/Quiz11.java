package day0714;

public class Quiz11 {

	public static void main(String[] args) {
		System.out.print(check(1));
	}
	static String check(int num) {
		return (num >= 0) ? "positive" : "negative";
	}
}
