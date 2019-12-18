package javalearning;

public class Datatype {

	public static void main(String[] args) {
		System.out.println(6); //Number-숫자
		System.out.println("six"); //String-문자열
		
		System.out.println("6"); //String 6;
		//사람이 보기엔 숫자지만 양 옆으로 큰 따옴표로 묶어주면 컴퓨터한테는 문자. 
		//이 구분이 중요한 이유는 각각의 데이터 타입별로 데이터 타입에 어울리는
		//필요로 하는 연산들이 다 다르기 때문에 엄격하게 분리할 필요가 있음.
		
		System.out.println(6+6); //12
		System.out.println("6" + "6"); //66
		//결합 연산자를 위한 문자를 위한 연산자가 사용
		
		System.out.println(6*6); //36
//		System.out.println("6" * "6");
		//문자열이란 데이터 타입은 곱하기란 연산은 못함
		System.out.println("1111".length()); //4
		//문자열의 길이를 알려주는 연산
//		System.out.println(1111.length());
		//1. 이 시스템에는 어떠한 종류의 데이터 타입들이 존재하는가 알아가는 것
		//2. 각각의 데이터 타입별로 어떠한 연산법들이 존재하나 알아가는 것
		//내가 컴퓨터로 할 수 있는 일의 가능성이 폭발적으로 증가함.
	}

}
