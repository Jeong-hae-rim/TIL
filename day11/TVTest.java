package day11;

class TV {
	private String model;
	private int size;
	private int channel;

	public TV() {
	};

	public TV(String model, int size, int channel) {
		this.model = model;
		this.size = size;
		this.channel = channel;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void channelUp() {
		// channel 변수의 값을 1 증가시킴, 10 보다 커지면 1 로 설정한다
		if (channel <= 10) {
			channel ++;
			}
		
		else;
		    channel = 1;
		}

	public void channelDown() {
		// channel 변수의 값을 1 감소시킴, 1보다 작아지면 10으로 설정한다.
		if (channel >= 1)
			channel--;
		
		else;
		    channel = 10;
		}

}

class SaleTV extends TV {
	private int price;

	public SaleTV() {
	};

	public SaleTV(int price, String model, int size, int channel) {
		super(model, size, channel);
		this.price = price;
	}

	public void play() {
		System.out.println("판매 TV 채널" + getChannel() + "번의 프로를 플레이 합니다.");
	}
	// “판매 TV 채널 X번의 프로를 플레이 합니다.”를 출력한다.

	public void sale() {
		System.out.println(getModel() + "모델의 상품을 판매합니다." + price + "을 지불해 주세요.");
	}
	// “대여 TV 채널 X번의 프로를 플레이 합니다.”를 출력한다.

	public String toString() {
		// “판매상품정보 : 모델명(XXXX), 가격(XX,XXX원), 크기(X)”를 리턴한다
		return String.format("판매상품정보 : 모델명(%s), 가격(%,d원), 크기(%d)", getModel(), price, getSize());
	}

}

class RentalTV extends TV implements Rentable {
	private int price;

	public RentalTV() {
	}

	public RentalTV(int price, String model, int size, int channel) {
		super(model, size, channel);
		this.price = price;
	}

	public void play() {
		System.out.println("대여 TV 채널" + getChannel() + "번의 프로를 플레이 합니다.");
	}

	public void rent() {
		System.out.println(getModel() + "모델의 상품을 대여합니다." + price + "을 지불해 주세요");
	}

	public String toString() {
		return String.format("대여상품정보 : 모델명(%s), 가격(%,d원), 크기(%d)", getModel(), price, getSize());
	}

}

public class TVTest {

	public static void main(String args[]) {
		SaleTV tv1 = new SaleTV(300000, "SALETV-1", 40, 1);
		RentalTV tv2 = new RentalTV(100000, "RENTALTV-10", 42, 1);


		tv1.channelUp();
		tv1.channelUp();
		tv2.channelDown();
		tv2.channelDown();
		tv2.channelDown();
	
		printAllTV(tv1);
		printAllTV(tv2);

		printRentalTV(tv2);
		// SaleTV 객체는 채널을 두 개 높인다.
		// RentalTV 객체는 채널을 세 개 내린다.
		// 각 객체에 대하여 printAllTV()을 호출한다.
		// Rentable 타입의 객체인 RentalTV 객체는 printRentalTV() 를 호출한다.
	}

	static void printAllTV(TV tv) {
		System.out.println(tv.toString());
		
		if (tv instanceof RentalTV)
			((RentalTV) tv).play();
		if (tv instanceof SaleTV)
			((SaleTV) tv).play();
		if (tv instanceof SaleTV)
			((SaleTV) tv).sale();

		
		// 아규먼트로 전달된 객체의 toString() 을 호출하여 각 상품의 정보를 출력한다.
		// 아규먼트로 전달된 객체의 play() 를 호출한다.
		// tv 변수에 전달된 객체가 SaleTV 타입이면 sale() 메서드를 호출한다.
	}

	static void printRentalTV(Rentable tv) {

		tv.rent();
		// 아규먼트로 전달된 Rentable 객체의 rent() 메서드를 호출한다.
	}

}
