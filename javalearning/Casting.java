package javalearning;

public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1; //double�� �Ǽ�
		
		double b = 1; //integer�� ����. �ս��� ��� �ڵ����� ĳ����.
		double b2 = (double) 1;
		
		System.out.println(b);
		
		// int c = 1.1; //������ �ϸ� ����. double �� �����͸� int ���� �� ����.
		double d = 1.1; //�������� �ٲ���. �ȶ�...
		int e = (int) 1.1; // add cast to int.
		System.out.println(e);
		//�ս��� �Ͼ. �ڵ����� ������ ����. ����ȯ�� ����� ��.
		
		// 1 to string
		String f = Integer.toString(1);
		System.out.println(f.getClass());

	}

}
