package Wearable;

public class Headphone implements Wearable {

	@Override
	public void puton() {
		System.out.println("������� �����߽��ϴ�.");
	}

	@Override
	public void putOff() {
		System.out.println("������� �������ϴ�.");
	}
	
	void setVolume(int volume) {
		System.out.println("������ �����߽��ϴ�.");
	}
	
}
