package javalearning;

public class WhileLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c = 0;
		char alpha = 'A';

		while (true) {
			int ran = (int) Math.random() * 31;
			if (ran == 0 || (27 <= ran && ran <= 31)) {
				break;
			} else {
				System.out.println((char) alpha + "(" + ran + ")");
				c++;
			}
		}
		System.out.println("수행횟수는" + c + "번입니다");
	}

}
