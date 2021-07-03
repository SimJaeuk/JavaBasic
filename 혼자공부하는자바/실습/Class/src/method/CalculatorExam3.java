package method;

public class CalculatorExam3 {

	public static void main(String[] args) {
		Calculator3 myCal3 = new Calculator3();
		
		//정사각형 넓이 구하기
		double result1 = myCal3.areaRectangle(10);
		
		//직사각형 넓이 구하기
		double result2 = myCal3.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이=" + result1);
		System.out.println("직사각형 넓이=" + result2);
		
	}
 
}
