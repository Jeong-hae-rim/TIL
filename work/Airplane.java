package work;

class Airplane extends Plane {
	
	public Airplane() {}
	
	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	public void flight(int distance) {
		super.setFuelSize(super.getFuelSize() - distance/10 * 30);
	}
	
	//일정 거리 만큼 운항, 연료 감소 10 운항 시 연료 30감소

}
