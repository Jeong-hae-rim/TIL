package day9;

class A {
	//super();
	A() {
	   System.out.println("A Ŭ������ ��ü �����մϴ�.");
	}
}

class B extends A {
	B(int num) {
		//super();
	   System.out.println("B Ŭ������ ��ü �����մϴ�.");
	}
}

class C extends B {
	C() {
		super(100) ; // ������ ���� �ִ� �޼��忡 �˸°� ȣ���ؾ� ��.
	   System.out.println("C Ŭ������ ��ü �����մϴ�.");
	    //super(100) ; ? : error��.
	}
}

public class ABCTest {

	public static void main(String[] args) {
	    new C () ;                                     // ��� ������ �޼���� ȣ�� ���ڸ��� ���� �޼��带 ȣ���ϸ� �����´�. (Object �޼��� ����.)
	                                                   // ������ arguments �� �޴� �����ڸ� ȣ��??
	                                                   // this �޼���� ù �࿡ ��������� ��

	}

}
