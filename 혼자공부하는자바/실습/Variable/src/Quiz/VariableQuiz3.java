package Quiz;

import java.util.*;

public class VariableQuiz3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String name = scanner.nextLine();

		System.out.print("2. 주민번호 앞 6자리: ");
		String frontId = scanner.nextLine();
		
		System.out.print("3. 핸드폰 번호: ");
		String phone = scanner.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(frontId);
		System.out.println(phone);
		
		
	}

}
