package day11;

public class ExceptionTest1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("수행시작");
		Thread.sleep(3000); //반드시 오류 처리를 해야 하는 메서드가 있다. 안 하면 컴파일을 안 해줌.
		System.out.println("수행종료");

	}

}
