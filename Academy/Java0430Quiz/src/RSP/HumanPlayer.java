package RSP;
import java.util.*;

public class HumanPlayer extends Player {
	 Scanner sc = new Scanner(System.in);
	
	 public int HumanHand() {
		 
	 do {
		 System.out.print("����������!!!0...����/1...����/2...��:");
		 hand = sc.nextInt();
	 }while(hand < 0 || hand > 2);
	 return hand;
	 }
}