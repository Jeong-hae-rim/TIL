package javalearning;

public class Exercise4 {

	public static void main(String[] args) {
		
		//1. int Ÿ���� ���� number �� �����ϰ� 100 �̶�� ���� �����Ѵ�.
		//2. int Ÿ���� ���� result �� �����Ѵ�.
		
		int number = 100;
		int result = number;
		
		//3. number ������ ���� 10�� ���ϰ� ����� result �� ��� 
		   //����� ����Ѵ�.    ������� : ���� ������ ��� - 110
		System.out.println("������� : ���� ������ ��� - " + (result+10));
		
		//4. number ������ ���� 10�� ���� ����� result �� ��� 
		   //����� ����Ѵ�.    ������� : ���� ������ ��� - 90
		System.out.println("������� : ���� ������ ���- " + (result-10));
		
		//5. number ������ ���� 10�� ���ϰ� ����� result �� ��� 
		   //����� ����Ѵ�.    ������� : ���� ������ ��� - 1000
		System.out.println("������� : ���� ������ ��� - " + (result*10));
		
		//6. number ������ ���� 10�� ������ ����� result �� ��� 
		   //����� ����Ѵ�.	  ������� : ������ ������ ��� - 10
		System.out.println("������� : ������ ������ ��� - " + (result/10));
		
		
	}

}
