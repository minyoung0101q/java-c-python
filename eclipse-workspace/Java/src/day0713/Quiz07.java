package day0713;

public class Quiz07 {

	public static void main(String[] args) {
		int[][] array = new int[3][5];
		int n = 1;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				array[i][j] = j*3 + (i+1);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
