package javalearning;

import java.util.Scanner;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//2. time �̶�� ������ �����Ͽ� 32150(��) �̶�� ���� �ʱ�ȭ �Ѵ�.   
		
		int time = 32150;
		
		System.out.println(time/3600); //��
		
		System.out.println((time%3600)/60); //��
		
		System.out.println((time%3600)%60); //��

		
		//3. time ������ ������ "XX�ð� XX�� XX��" �������� ��ȯ�Ͽ� ����Ѵ�.
		
		System.out.println( (time/3600) + "�ð�" + (time%3600)/60 + "��" +(time%3600)%60 + "��");
		
		

	       // �̷� ������ε� ��. ��. �ʸ� ���� �� �ִ�.
	        
	        int hour, min, sec;
	        
	        Scanner s = new Scanner(System.in);
	        System.out.println("�ʸ� �Է� >>");
	        sec = s.nextInt();
	        
	        min = sec / 60;
	        hour = min / 60;
	        sec = sec % 60;
	        min = min % 60;
	        System.out.printf("%d�� %d�� %d��", hour, min, sec);
	    }

		
}


