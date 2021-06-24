package exam;

public class ConditionalOperation {

	public static void main(String[] args) {
		int score = 85;
		String grade = (score > 90) ? "A" : ((score > 80) ? "B" : "C");
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		// (조건식) ? 값 또는 연산식 : 값 또는 연산식
		// 조건식이 트루면 왼쪽 연산, 조건식이 펄스면 오른쪽 연산

	}

}
