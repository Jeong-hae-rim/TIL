package javalearning;

public class Exercise4 {

	public static void main(String[] args) {
		
		//1. int Ÿ���� ���� number �� �����ϰ� 100 �̶�� ���� �����Ѵ�.
		//2. int Ÿ���� ���� result �� �����Ѵ�.
		
		int number = 100;
		int result;
		
		//3. number ������ ���� 10�� ���ϰ� ����� result �� ��� 
		   //����� ����Ѵ�.    ������� : ���� ������ ��� - 110
		result = number + 10 ;
		System.out.println("������� : ���� ������ ��� - " + (result));
		
		//4. number ������ ���� 10�� ���� ����� result �� ��� 
		   //����� ����Ѵ�.    ������� : ���� ������ ��� - 90
		result = number - 10 ;
		System.out.println("������� : ���� ������ ���- " + (result));
		
		//5. number ������ ���� 10�� ���ϰ� ����� result �� ��� 
		   //����� ����Ѵ�.    ������� : ���� ������ ��� - 1000
		result = number * 10 ;
		System.out.println("������� : ���� ������ ��� - " + (result));
		
		//6. number ������ ���� 10�� ������ ����� result �� ��� 
		   //����� ����Ѵ�.	  ������� : ������ ������ ��� - 10
		result = number / 10 ;
		System.out.println("������� : ������ ������ ��� - " + (result));
		
		
	}

}
