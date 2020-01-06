package javalearning;

public class ForLab8 {

	public static void main(String[] args) {

		char alpha = 'A';

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(alpha++);
			}
			System.out.println();
		}
		
	}

}
