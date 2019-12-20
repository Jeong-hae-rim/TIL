package day12;

import java.util.Date;

class Value {
	int value;
	Value(int value){
		this.value = value;
	}
	public boolean equals(Object obj) { //어떤 객체도 받을 수 있도록 Object로 받음.
		boolean result = false;
        if(obj != null && obj instanceof Value) //null이 아닌데다 obj에 value객체가 전달되었을 때 
        	if(value == ((Value)obj).value) //형변환해줘야지만 사용 가능. 
        		result = true;
		return result;
    }
}
public class EqualsTest {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		Value v3 = new Value(20);
		System.out.println(v1.equals(null)); // f
		System.out.println(v1.equals(v3));   // f
		System.out.println(v1.equals(v2));   // t
		System.out.println(v1.equals(new Date()));   // f

		if(v1==v2) //등가를 쓰면 참조값만 비교. 
			System.out.println("v1과 v2는 같습니다.");
		else 
			System.out.println("v1과 v2는 다릅니다.");
		v2 = v1; //obj에 있는 것은 등가 연산
		if(v1==v2) 
			System.out.println("v1과 v2는 같습니다.");
		else 
			System.out.println("v1과 v2는 다릅니다.");
		
		String s1 = "가나다";
		String s2 = "가나다";
		String s3 = new String("가나다");
		String s4 = new String("가나다");
		
		System.out.println(s1 == s2);        // f. ? 똑같은 내용의 문자열 리터럴을 두 번 이상 쓰면 객체는 실제 하나만. 
		System.out.println(s3 == s4);        // f
		System.out.println(s1.equals(s2));   // t
		System.out.println(s3.equals(s4));   // t
		
	}
}
