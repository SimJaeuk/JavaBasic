package RSP;

public class RSP {

	public static void main(String[] args) {
		HumanPlayer hp = new HumanPlayer();
		ComputerPlayer cp = new ComputerPlayer();
		String[] hands = {"����","����","��"};
		
		int HumanHand = hp.HumanHand();
		int ComputerHand = cp.ComputerHand();
		
		System.out.println("���� "+hands[ComputerHand]+"�̰�, �����"+hands[HumanHand]+"�Դϴ�. ");
		System.out.println(RSP(ComputerHand, HumanHand));
		
	
		
	}
	public static String RSP(int com, int per) {
		if ((com - per == -1) || (com - per == 2))
			return "����� �����ϴ�.";
		
		else if(com - per == 0)
			return "�����ϴ�.";
		
		else
			return "����� �̰���ϴ�.";
	}

}
