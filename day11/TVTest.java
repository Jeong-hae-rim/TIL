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
		// channel ������ ���� 1 ������Ŵ, 10 ���� Ŀ���� 1 �� �����Ѵ�
		if (channel <= 10) {
			channel ++;
			}
		
		else;
		    channel = 1;
		}

	public void channelDown() {
		// channel ������ ���� 1 ���ҽ�Ŵ, 1���� �۾����� 10���� �����Ѵ�.
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
		System.out.println("�Ǹ� TV ä��" + getChannel() + "���� ���θ� �÷��� �մϴ�.");
	}
	// ���Ǹ� TV ä�� X���� ���θ� �÷��� �մϴ�.���� ����Ѵ�.

	public void sale() {
		System.out.println(getModel() + "���� ��ǰ�� �Ǹ��մϴ�." + price + "�� ������ �ּ���.");
	}
	// ���뿩 TV ä�� X���� ���θ� �÷��� �մϴ�.���� ����Ѵ�.

	public String toString() {
		// ���ǸŻ�ǰ���� : �𵨸�(XXXX), ����(XX,XXX��), ũ��(X)���� �����Ѵ�
		return String.format("�ǸŻ�ǰ���� : �𵨸�(%s), ����(%,d��), ũ��(%d)", getModel(), price, getSize());
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
		System.out.println("�뿩 TV ä��" + getChannel() + "���� ���θ� �÷��� �մϴ�.");
	}

	public void rent() {
		System.out.println(getModel() + "���� ��ǰ�� �뿩�մϴ�." + price + "�� ������ �ּ���");
	}

	public String toString() {
		return String.format("�뿩��ǰ���� : �𵨸�(%s), ����(%,d��), ũ��(%d)", getModel(), price, getSize());
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
		// SaleTV ��ü�� ä���� �� �� ���δ�.
		// RentalTV ��ü�� ä���� �� �� ������.
		// �� ��ü�� ���Ͽ� printAllTV()�� ȣ���Ѵ�.
		// Rentable Ÿ���� ��ü�� RentalTV ��ü�� printRentalTV() �� ȣ���Ѵ�.
	}

	static void printAllTV(TV tv) {
		System.out.println(tv.toString());
		
		if (tv instanceof RentalTV)
			((RentalTV) tv).play();
		if (tv instanceof SaleTV)
			((SaleTV) tv).play();
		if (tv instanceof SaleTV)
			((SaleTV) tv).sale();

		
		// �ƱԸ�Ʈ�� ���޵� ��ü�� toString() �� ȣ���Ͽ� �� ��ǰ�� ������ ����Ѵ�.
		// �ƱԸ�Ʈ�� ���޵� ��ü�� play() �� ȣ���Ѵ�.
		// tv ������ ���޵� ��ü�� SaleTV Ÿ���̸� sale() �޼��带 ȣ���Ѵ�.
	}

	static void printRentalTV(Rentable tv) {

		tv.rent();
		// �ƱԸ�Ʈ�� ���޵� Rentable ��ü�� rent() �޼��带 ȣ���Ѵ�.
	}

}
