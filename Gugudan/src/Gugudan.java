import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		System.out.print("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		
		if (number < 2) {
			System.out.println("값을 잘못 입력했습니다.");
		} else if (number > 9) {
			System.out.println("값을 잘못 입력했습니다.");
		} else {
		for(int i = 1; i < 10; i++) {
			System.out.println(i * number);
		}
	}
		
		

	}

}
