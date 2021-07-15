package queue;

import java.util.*;

public class QueueExam {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sandMail", "심자바"));
		messageQueue.offer(new Message("sandSMS", "홍길동"));
		messageQueue.offer(new Message("sandKakaotalk", "홍두께"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll(); //메세지 1개 꺼내기
			switch(message.command) {
			case "sandMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sandSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sandKakaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}

	}

}
