package javalearning;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//2. time �̶�� ������ �����Ͽ� 32150(��) �̶�� ���� �ʱ�ȭ �Ѵ�.   
		
		int time = 32150;
		
		System.out.println(time/3600);
		
		System.out.println((time%3600)/60);
		
		System.out.println((time%3600)%60);

		
		//3. time ������ ������ "XX�ð� XX�� XX��" �������� ��ȯ�Ͽ� ����Ѵ�.
		
		System.out.println( (time/3600) + "�ð�" + (time%3600)/60 + "��" +(time%3600)%60 + "��");
		
		
	}

}
