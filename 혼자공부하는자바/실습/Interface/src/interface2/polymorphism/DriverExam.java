package interface2.polymorphism;

public class DriverExam {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//�ڵ� Ÿ�� ��ȯ
		driver.drive(bus);
		driver.drive(taxi);

	}

}
