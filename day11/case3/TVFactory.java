package day11.case3;

public class TVFactory { //~를 객체 생성을 대신 하는 클래스라는 의미. 객체를 만들어주는 곳.
	public static TV getTV(String beanName){ //Tv의 객체 모두를 리턴하겠다는 의미.
		TV obj = null;
		if(beanName.equals("samsung")){
			obj = new SamsungTV();
		} else if(beanName.equals("lg")){
			obj = new LgTV();
		}
		return obj;
	}

}
