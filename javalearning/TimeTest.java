package javalearning;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//2. time 이라는 변수를 선언하여 32150(초) 이라는 값을 초기화 한다.   
		
		int time = 32150;
		
		System.out.println(time/3600);
		
		System.out.println((time%3600)/60);
		
		System.out.println((time%3600)%60);

		
		//3. time 변수의 값으로 "XX시간 XX분 XX초" 형식으로 변환하여 출력한다.
		
		System.out.println( (time/3600) + "시간" + (time%3600)/60 + "뷴" +(time%3600)%60 + "초");
		
		
	}

}
