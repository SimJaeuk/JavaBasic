package Wearable;

public class Headphone implements Wearable {

	@Override
	public void puton() {
		System.out.println("헤드폰을 착용했습니다.");
	}

	@Override
	public void putOff() {
		System.out.println("헤드폰을 벗었습니다.");
	}
	
	void setVolume(int volume) {
		System.out.println("볼륨을 조정했습니다.");
	}
	
}
