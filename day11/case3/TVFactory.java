package day11.case3;

public class TVFactory { //~�� ��ü ������ ��� �ϴ� Ŭ������� �ǹ�. ��ü�� ������ִ� ��.
	public static TV getTV(String beanName){ //Tv�� ��ü ��θ� �����ϰڴٴ� �ǹ�.
		TV obj = null;
		if(beanName.equals("samsung")){
			obj = new SamsungTV();
		} else if(beanName.equals("lg")){
			obj = new LgTV();
		}
		return obj;
	}

}
