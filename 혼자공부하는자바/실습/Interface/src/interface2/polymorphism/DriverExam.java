package interface2.polymorphism;

public class DriverExam {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//자동 타입 변환
		driver.drive(bus);
		driver.drive(taxi);

	}

}
