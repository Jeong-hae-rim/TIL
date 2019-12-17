package day10;
import java.util.Scanner;
public class ScannerLab3 {
	public static void main(String[] args) {
		boolean flag = true;
		int loop = 0;
		Scanner sc = new Scanner(System.in); //while 구문 밖으로 빼줘야 함.
		
		while(flag) {
			
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int number1 = sc.nextInt();	
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int number2 = sc.nextInt();
		System.out.print("연산자(+,-,*,/)를 입력하세요 : ");
		String calculate;
		calculate = sc.next();
	
		//숫자와 연산자를 입력받아 처리하는 기능을 사용자가
		//원할 때까지 반복하도록 코드 추가
		//결과 출력 사용자에게 계속 수행하겠는지에 대해 메세지를 출력하고
		//1을 입력하면 계속 수행하고 다른 숫자를 입력하면 종료
		switch(calculate) {
		case "+":	
			System.out.printf("%d 와 %d의 %s 연산 결과는 %d입니다.",number1, number2, calculate, number1 + number2);
			break;
		case "-":
			System.out.printf("%d 와 %d의 %s 연산 결과는 %d입니다.",number1, number2, calculate, number1 - number2);
			break;
		case "*":
			System.out.printf("%d 와 %d의 %s 연산 결과는 %d입니다.",number1, number2, calculate, number1 * number2);
			break;
		case "/":
			System.out.printf("%d 와 %d의 %s 연산 결과는 %d입니다.",number1, number2, calculate, number1 / number2);
			break;
		default: System.out.println("+,-,*,/를 입력하숑");
			break;
		}
		System.out.println();
		System.out.print("계속 수행하시겠습니까?(1 입력: 계속 수행, 다른 숫자 입력 : 종료) : ");
		loop = sc.nextInt();
		if(loop != 1)
		{
			flag = false; 
		}
			}
		sc.close();
	}
}
