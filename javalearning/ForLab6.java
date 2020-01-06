package javalearning;

public class ForLab6 {

	public static void main(String[] args) {
		
		final char AND = '&';
		// 상수 타입은 final을 붙여서 만든다.
		int num = (int) (Math.random()*6) + 5;
	
			for(int i = 1 ; i<=num ; i++) {
				for(int j = 1 ; j<=i ; j++) {
					//
					System.out.print(AND);
			}
			System.out.println();

		
	}

  }
}