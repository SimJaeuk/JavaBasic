package ch04.b;

import ch04.a.Cal;

// main이 있는 자바파일 -> 실행파일
public class App {

	// JVM이 main메서드를 찾으려면 public이 필요 -> 공개
	// JVM이 main메서드를 찾으려면 static이 필요 -> 메모리에 올림
	// main 메서드만 return 타입을 허용하지 않는다.
	// main 메서드의 이름은 main이다.
	
	public static void main(String[] args) {
		Cal c = new Cal();
		c.minus();
	}

}
