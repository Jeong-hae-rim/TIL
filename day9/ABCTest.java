package day9;

class A {
	//super();
	A() {
	   System.out.println("A 클래스를 객체 생성합니다.");
	}
}

class B extends A {
	B(int num) {
		//super();
	   System.out.println("B 클래스를 객체 생성합니다.");
	}
}

class C extends B {
	C() {
		super(100) ; // 조상이 갖고 있는 메서드에 알맞게 호출해야 함.
	   System.out.println("C 클래스를 객체 생성합니다.");
	    //super(100) ; ? : error남.
	}
}

public class ABCTest {

	public static void main(String[] args) {
	    new C () ;                                     // 모든 생성자 메서드는 호출 되자마자 조상 메서드를 호출하며 내려온다. (Object 메서드 빼고.)
	                                                   // 조상의 arguments 안 받는 샏성자를 호출??
	                                                   // this 메서드는 첫 행에 구현해줘야 함

	}

}
