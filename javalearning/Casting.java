package javalearning;

public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1; //double형 실수
		
		double b = 1; //integer형 정수. 손실이 없어서 자동으로 캐스팅.
		double b2 = (double) 1;
		
		System.out.println(b);
		
		// int c = 1.1; //담으려 하면 에러. double 형 데이터를 int 형에 못 담음.
		double d = 1.1; //컴파일이 바꿔줌. 똑똑...
		int e = (int) 1.1; // add cast to int.
		System.out.println(e);
		//손실이 일어남. 자동으로 해주지 않음. 형변환을 해줘야 함.
		
		// 1 to string
		String f = Integer.toString(1);
		System.out.println(f.getClass());

	}

}
