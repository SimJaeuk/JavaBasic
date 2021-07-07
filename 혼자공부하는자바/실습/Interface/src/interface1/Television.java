package interface1;

public class Television implements RemoteControl{
	
	//�ʵ�
	private int volume;
	
	//turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	//TurnOff() ...
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	//setVolume() ...
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� TV ����: " + this.volume);
	}
	

}
