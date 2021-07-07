package finalmethod;

public class SportsCar extends Car {
	@Override
	public void speedUp() { speed += 10; }
	
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	} 파이널 메소드는 재정의할 수 없음
	
}
