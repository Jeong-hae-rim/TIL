package work;

class Cargoplane extends Plane {

	public Cargoplane() {}
	
	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	public void flight(int distance) {
		super.setFuelSize(super.getFuelSize() - distance/10 * 50);
	}

	//일정 거리 만큼 운항, 연료 감소 10운항 시 연료 50감소

}
