package exercise;

class Human{
	
	private String name;
	private int age;
	private int height;
	private int weight;
	
	public Human(){		
	}
	public Human(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}	
	public String printInfomation() {
		return "	" + name + "	" + age + "	" + height + "	" + weight ;	
				
	}
}

class Student extends Human {
	private String number;
	private String major;
	
	public Student() {
		
	}

	public Student (String name, int age, int height, int weight , String number, String major) {
		super(name,age,height,weight);
		
		this.number = number;
		this.major = major;
	}
	
	public String printInfomation() {
		//return super.getInfo() + PhoneNum + Email;
		return super. printInfomation() + "	" + number + "	" + major;
	}
	
}

public class StudentTest {

	public static void main(String[] args) {
		
		Student arreys [] = new Student [3];
		arreys [0] = new Student ("홍길동", 20, 171, 81, "201101", "영문");
		arreys [1] = new Student ("고길동", 21, 183, 72, "201102", "건축");
		arreys [2] = new Student ("박길동", 22, 175, 65, "201103", "컴공");
		
		System.out.println(arreys[0].printInfomation());
		System.out.println(arreys[1].printInfomation());
		System.out.println(arreys[2].printInfomation());
				

	}

}
