package day9;


class Person {
	private String name;
	Person(String name) {
		this.name = name;
	}
	public String getInfo() {
		return name;
	}
}

class Friend extends Person {
	private String PhoneNum;
	private String Email;
	
	Friend(String name, String PhoneNum, String Email) {
		super (name) ; 
	
		this.PhoneNum = PhoneNum;
		this.Email = Email;
	}
	public String getInfo() {
		//return super.getInfo() + PhoneNum + Email;
		return String.format("%-20s%-20s%-20s\n", super.getInfo(), PhoneNum, Email);
	}
	
}

public class FriendTest {

	public static void main(String[] args) {

		Person aaa = new Friend("홍길동 ", "01073585590", "XXX@naver.com");
		Person bbb = new Friend("이미나", "01044567890", "YYY@naver.com");
		Person ccc = new Friend("오정석", "01077401250", "ZZZ@naver.com");
		Person ddd = new Friend("전지현", "01066781230", "AAA@naver.com");
		Person fff = new Friend("야나두", "01044567052", "BBB@naver.com");		

		System.out.println(" 이름 " + "            " + "전화번호" + "                 " + "메일주소");
		System.out.println("------------------------------------");
		
		
		System.out.println(aaa.getInfo());
		System.out.println(bbb.getInfo());
		System.out.println(ccc.getInfo());
		System.out.println(ddd.getInfo());
		System.out.println(fff.getInfo());
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
