package Wearable;

public class WearableComputer implements Wearable {

	@Override
	public void puton() {
		System.out.println("��ǻ�͸� �����߽��ϴ�..");
	}

	@Override
	public void putOff() {
		System.out.println("��ǻ�͸� �����ϴ�.");
	}
	
	public void reboot() {
		System.out.println("��ǻ�͸� ������մϴ�.");
	}
}
