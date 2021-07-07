package methododverriding;

public class Computer extends Calculator {
	// -> 오버라이드 어노테이션은 생략해도 좋으나 오타 발생 시 컴파일 에러를 일으켜 개발자의 실수를 줄여줌
	@Override 
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행"); //재정의
		return Math.PI * r * r;
	}
	
	

}
