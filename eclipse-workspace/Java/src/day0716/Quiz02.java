package day0716;

public class Quiz02 {

	public static void main(String[] args) {
		int i=3, k=1;
		switch (i) {
		case 0:
		case 1:
		case 2:
		case 3: k=0;
		case 4: k+=3;
		case 5: k-=10;
		default: k--;
		}
		System.out.println(k);
	}
}
