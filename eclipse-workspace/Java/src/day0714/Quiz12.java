package day0714;

public class Quiz12 { //전역 변수 선언 방법

//	static int globalVariable; //전역 변수 선언 
	
	public static void main(String[] args) {
		Quiz12 a1 = new Quiz12();
		ovr2 a2 = new ovr2();
		System.out.println(a1.sum(3, 2) + a2.sun(3, 2));
	}
	
	int sum(int x, int y) {
		return x + y; //+ globalVariable;
	}
}

class ovr2 extends Quiz12 {
	int sun(int x, int y) {
		return x - y + super.sum(x, y); // + globalVariable;  전
	}
}
