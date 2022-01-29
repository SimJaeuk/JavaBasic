package ch05;

interface RemoconAble {
	public void 초록버튼();
	public void 빨간버튼();
}

class Samsung implements RemoconAble{
	@Override
	public void 빨간버튼() {
		System.out.println("전원이 꺼졌습니다.");
	}
	@Override
	public void 초록버튼() {
		System.out.println("전원이 켜졌습니다.");
	}
}

class LG implements RemoconAble{
	@Override
	public void 빨간버튼() {
		System.out.println("전원이 꺼졌습니다.");
	}
	@Override
	public void 초록버튼() {
		System.out.println("전원이 켜졌습니다.");
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
