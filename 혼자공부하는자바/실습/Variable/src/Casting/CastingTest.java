package Casting;

public class CastingTest {

	public static void main(String[] args) {
		
		long longValue = 500;
		int intValue = 1;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		// 소수점 이하부분은 제거됨
	}

}

