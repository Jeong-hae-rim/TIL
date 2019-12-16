package work;

public class PlaneTest {

	public static void main(String[] args) {
		Plane arreys [] = new Plane [2];
		arreys [0] = new Airplane ("L747", 1000);
		arreys [1] = new Cargoplane ("C40", 1000);
		
		printInfo(arreys);
		
		System.out.println();
		System.out.println("[100 운항]");
		arreys[0].flight(100);
		arreys[1].flight(100);
		printInfo(arreys);
		
		System.out.println();
		System.out.println("[200 주유]");
		arreys[0].refuel(200);
		arreys[1].refuel(200);
		printInfo(arreys);

	}



public static void printInfo(Plane[] list) {
	System.out.println("Plane     fuelSize");
	System.out.println("-------------------");
	
	list[0].getPlaneName();
	list[1].getPlaneName();
	
	System.out.println(list[0].getPlaneName() + "       " + list[0].getFuelSize());
	System.out.println(list[1].getPlaneName() + "        " + list[1].getFuelSize());
   }

}