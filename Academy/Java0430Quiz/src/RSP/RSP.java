package RSP;

public class RSP {

	public static void main(String[] args) {
		HumanPlayer hp = new HumanPlayer();
		ComputerPlayer cp = new ComputerPlayer();
		String[] hands = {"바위","가위","보"};
		
		int HumanHand = hp.HumanHand();
		int ComputerHand = cp.ComputerHand();
		
		System.out.println("나는 "+hands[ComputerHand]+"이고, 당신은"+hands[HumanHand]+"입니다. ");
		System.out.println(RSP(ComputerHand, HumanHand));
		
	
		
	}
	public static String RSP(int com, int per) {
		if ((com - per == -1) || (com - per == 2))
			return "당신이 졌습니다.";
		
		else if(com - per == 0)
			return "비겼습니다.";
		
		else
			return "당신이 이겼습니다.";
	}

}
