package day11.case3;

public class TVUser {
	public static void main(String[] args) {		
		TV tv = TVFactory.getTV(args[0]); //메인메서드의 매개변수. 프로그램 아규먼트를 전달하는 역할. 
		if(tv != null) {                  //프로그램 아규먼트 : 프로그램을 전달해주는 데이타.
			tv.powerOn();                 // Run - Run configuration - argument에 입력.
			tv.volumnUp();
			tv.volumnDown();
			tv.powerOff();
		} else {
			System.out.println("프로그램 아규먼트로 samsung 또는 lg 를 입력해 주세요..");
		}
	}
}

//case1 -> case 2 -> case3 순으로 유지보수성이 좋아짐. 고칠게  없어지고 규격화 됨.