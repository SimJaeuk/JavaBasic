package method;

public class CarExam2 {
	public static void main(String[] args) {
		
		Car2 myCar2 = new Car2();
		myCar2.keyTurnOn();
		myCar2.run();
		int speed = myCar2.getSpeed();
		System.out.println("���� �ӵ�: " + speed + "km/h");
		
	}
}
