package javalearning;

public class WhileLab2 {

	public static void main(String[] args) {

		while (true) {
			int pairNum1 = (int) (Math.random() * 6) + 1;
			int pairNum2 = (int) (Math.random() * 6) + 1;
			if (pairNum1 > pairNum2) {
				System.out.println(pairNum1 + "�� " + pairNum2 + "���� ũ��.");
			} else if (pairNum1 < pairNum2) {
				System.out.println(pairNum1 + "�� " + pairNum2 + "���� �۴�.");
			} else {
				System.out.println("���� ��.");

				break;

			}

		}

	}

}
