import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		System.out.print("������ �� ����� ����? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		
		if (number < 2) {
			System.out.println("���� �߸� �Է��߽��ϴ�.");
		} else if (number > 9) {
			System.out.println("���� �߸� �Է��߽��ϴ�.");
		} else {
		for(int i = 1; i < 10; i++) {
			System.out.println(i * number);
		}
	}
		
		

	}

}
