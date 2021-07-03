package method;

public class Computer {

	// 매개 변수의 개수를 모를 경우
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	// 메소드의 매개 변수를 ...을 사용해서 선언하면 호출 시 자동으로 배열이 생성
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
