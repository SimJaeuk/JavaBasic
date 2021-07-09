package runtimeException;

public class NumberFormatExceptionExam {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100"; //숫자로 변환할 수 없음
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); //NFE 발생
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
		
	}

}
