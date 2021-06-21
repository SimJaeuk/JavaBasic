package Casting;

public class CastingTest2 {

	public static void main(String[] args) {
		byte value1 = 1;
		int value2 = 10;
		long value3 = 100L;
		long result = value1 + value2 + value3;
		System.out.println(result);
		// 허용 범위가 더 큰 long타입 변수에 저장해야함.
	}

}
