package method;

public class CalculatorExam3 {

	public static void main(String[] args) {
		Calculator3 myCal3 = new Calculator3();
		
		//���簢�� ���� ���ϱ�
		double result1 = myCal3.areaRectangle(10);
		
		//���簢�� ���� ���ϱ�
		double result2 = myCal3.areaRectangle(10, 20);
		
		System.out.println("���簢�� ����=" + result1);
		System.out.println("���簢�� ����=" + result2);
		
	}
 
}
