package ch05;

interface RemoconAble {
	public void �ʷϹ�ư();
	public void ������ư();
}

class Samsung implements RemoconAble{
	@Override
	public void ������ư() {
		System.out.println("������ �������ϴ�.");
	}
	@Override
	public void �ʷϹ�ư() {
		System.out.println("������ �������ϴ�.");
	}
}

class LG implements RemoconAble{
	@Override
	public void ������ư() {
		System.out.println("������ �������ϴ�.");
	}
	@Override
	public void �ʷϹ�ư() {
		System.out.println("������ �������ϴ�.");
	}
}

public class ExampleEx01 {

	public static void main(String[] args) {
		
		Samsung sr1 = new Samsung();
		Samsung sr2 = new Samsung();
		
		LG lr1 = new LG();
		LG lr2 = new LG();
		
	}

}
