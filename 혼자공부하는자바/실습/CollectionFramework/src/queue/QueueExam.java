package queue;

import java.util.*;

public class QueueExam {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sandMail", "���ڹ�"));
		messageQueue.offer(new Message("sandSMS", "ȫ�浿"));
		messageQueue.offer(new Message("sandKakaotalk", "ȫ�β�"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll(); //�޼��� 1�� ������
			switch(message.command) {
			case "sandMail":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			case "sandSMS":
				System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
				break;
			case "sandKakaotalk":
				System.out.println(message.to + "�Կ��� īī������ �����ϴ�.");
				break;
			}
		}

	}

}
