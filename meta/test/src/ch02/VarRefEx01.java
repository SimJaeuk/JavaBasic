package ch02;

// new가 되어서 힙에 할당이 될 때 사이즈를 알 수 있다. (프로그램이 실행되었을 때 = Runtime)

class MyData {
	int id = 1; // 4Byte
	int price = 1000; // 4Byte
	
}

// 참조변수, 일반변수
public class VarRefEx01 {
	
	public static void main(String[] args) {
		// int num; -> 변수 선언
		// int num = 10; -> 변수 초기화
		int num = 10; // 일반변수 -> 크기가 정해져 있는 것 (컴파일 시점)
		MyData d = new MyData(); // 참조변수 -> 크기가 정해져 있지 않는 것(컴파일 시점)
		
		System.out.println(num);
		System.out.println(d.id);
		System.out.println(d.price);


	}

}
