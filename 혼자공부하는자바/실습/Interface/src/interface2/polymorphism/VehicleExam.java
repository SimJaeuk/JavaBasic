package interface2.polymorphism;

public class VehicleExam {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		Bus bus = new Bus();
		
		vehicle.run();
		bus.run();
		bus.checkFare();

	}

}
