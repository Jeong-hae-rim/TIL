package day10;
import java.util.Scanner;
public class ScannerLab3 {
	public static void main(String[] args) {
		boolean flag = true;
		int loop = 0;
		Scanner sc = new Scanner(System.in); //while ���� ������ ����� ��.
		
		while(flag) {
			
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		int number1 = sc.nextInt();	
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int number2 = sc.nextInt();
		System.out.print("������(+,-,*,/)�� �Է��ϼ��� : ");
		String calculate;
		calculate = sc.next();
	
		//���ڿ� �����ڸ� �Է¹޾� ó���ϴ� ����� ����ڰ�
		//���� ������ �ݺ��ϵ��� �ڵ� �߰�
		//��� ��� ����ڿ��� ��� �����ϰڴ����� ���� �޼����� ����ϰ�
		//1�� �Է��ϸ� ��� �����ϰ� �ٸ� ���ڸ� �Է��ϸ� ����
		switch(calculate) {
		case "+":	
			System.out.printf("%d �� %d�� %s ���� ����� %d�Դϴ�.",number1, number2, calculate, number1 + number2);
			break;
		case "-":
			System.out.printf("%d �� %d�� %s ���� ����� %d�Դϴ�.",number1, number2, calculate, number1 - number2);
			break;
		case "*":
			System.out.printf("%d �� %d�� %s ���� ����� %d�Դϴ�.",number1, number2, calculate, number1 * number2);
			break;
		case "/":
			System.out.printf("%d �� %d�� %s ���� ����� %d�Դϴ�.",number1, number2, calculate, number1 / number2);
			break;
		default: System.out.println("+,-,*,/�� �Է��ϼ�");
			break;
		}
		System.out.println();
		System.out.print("��� �����Ͻðڽ��ϱ�?(1 �Է�: ��� ����, �ٸ� ���� �Է� : ����) : ");
		loop = sc.nextInt();
		if(loop != 1)
		{
			flag = false; 
		}
			}
		sc.close();
	}
}
