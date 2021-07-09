package RSP;
import java.util.*;

public class HumanPlayer extends Player {
	 Scanner sc = new Scanner(System.in);
	
	 public int HumanHand() {
		 
	 do {
		 System.out.print("가위바위보!!!0...바위/1...가위/2...보:");
		 hand = sc.nextInt();
	 }while(hand < 0 || hand > 2);
	 return hand;
	 }
}