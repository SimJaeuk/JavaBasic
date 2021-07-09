package Wearable;

public class WearableComputer implements Wearable {

	@Override
	public void puton() {
		System.out.println("컴퓨터를 실행했습니다..");
	}

	@Override
	public void putOff() {
		System.out.println("컴퓨터를 껏습니다.");
	}
	
	public void reboot() {
		System.out.println("컴퓨터를 재시작합니다.");
	}
}
