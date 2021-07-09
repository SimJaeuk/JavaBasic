package RSP;
import java.util.*;

public class ComputerPlayer extends Player {
	Random rand = new Random();
	
	public int ComputerHand() {
		return rand.nextInt(3);
	}
	
}
