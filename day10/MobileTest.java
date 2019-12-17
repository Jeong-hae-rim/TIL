package day10;



	
abstract class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;
	
	public Mobile () {}
	
	public Mobile(String mobileName, int batterySize, String osType){
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}	
	
	public abstract void operate (int time);
	public abstract void charge (int time);

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	} // Source - Generate getter and setter를 이용하면 쉽게 만들 수 있다!
}

class Ltab extends Mobile {
	
	public Ltab() {}
	
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	public void operate(int time) {
		super.setBatterySize(super.getBatterySize() - time * 10);
		//사용을 통해 배터리 감소 구현, 1분 사용 시 배터리 10 감소

	}
	public void charge(int time) {
		super.setBatterySize(super.getBatterySize() + time * 10);
		//사용을 통해 배터리 감소 구현, 1분 충전 시 배터리 10 증가
	}
}

class Otab extends Mobile {
	
	public Otab() {}
	
	public Otab(String mobileName, int batterySize, String osType) {
	    super(mobileName, batterySize, osType);
    }

	public void operate(int time) {
		super.setBatterySize(super.getBatterySize() - time * 12);
		//사용을 통해 배터리 감소 구현, 1분 충전 시 배터리 12 감소
	}
	
	public void charge(int time) {
		super.setBatterySize(super.getBatterySize() + time * 8);
		//사용을 통해 배터리 감소 구현, 1분 충전 시 배터리 8 증가
	}
}

public class MobileTest {
    public static void main(String[] args) {
		Ltab mmm = new Ltab ("Ltab", 500, "ABC-01");
		Otab MMM = new Otab ("Otab", 1000, "XYZ-20");
		
		printTitle();
		printMobile(mmm);
		printMobile(MMM);
		System.out.println();
		
		mmm.charge(10);
		MMM.charge(10);
		
		System.out.println("[10분 충전]");
		printTitle();
		printMobile(mmm);
		printMobile(MMM);
		System.out.println();
		
		mmm.operate(5);
		MMM.operate(5);
		
		System.out.println("[5분 통화]");
		printTitle();
		printMobile(mmm);
		printMobile(MMM);
	} //구현 1, 2에서 호출을 해와야 함
    
    public static void printMobile(Mobile mobile) {
    	System.out.printf("%-10s\t %-10d\t %-10s \n", mobile.getMobileName(), mobile.getBatterySize(), mobile.getOsType());
    } //먼저 구현 1

    public static void printTitle() {
        System.out.println("Mobile	     Battery		    OS");
        System.out.println("-------------------------------------------------------");
    } //먼저 구현 2

}
