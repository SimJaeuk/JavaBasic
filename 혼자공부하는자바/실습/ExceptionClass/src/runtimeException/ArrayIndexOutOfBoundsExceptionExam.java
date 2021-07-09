package runtimeException;

public class ArrayIndexOutOfBoundsExceptionExam {

	public static void main(String[] args) {
		if(args.length == 2) {
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
		}else {
			System.out.println("실행 매개값이 필요합니다.");
		}
		//실행 매개값을 주지 않았기 때문에 인덱스를 사용할 수 없음

	}

}
