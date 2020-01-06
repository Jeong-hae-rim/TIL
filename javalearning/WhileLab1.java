package javalearning;

public class WhileLab1 {

	public static void main(String[] args) {

		int ran = (int) (Math.random() * 6) + 5;
		int i = 0;

		System.out.println("[for 결과]");
		for (i = 1; i <= ran; i++) {
			System.out.println(i + "->" + i * i);
		}
		
		System.out.println();
		
		int j = 0;
		System.out.println("[while 결과]");
		while (j <= ran) {
			System.out.println(j + "->" + j * j);
			j++;
		}

	}

}
