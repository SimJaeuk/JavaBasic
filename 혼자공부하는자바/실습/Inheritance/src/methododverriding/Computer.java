package methododverriding;

public class Computer extends Calculator {
	// -> �������̵� ������̼��� �����ص� ������ ��Ÿ �߻� �� ������ ������ ������ �������� �Ǽ��� �ٿ���
	@Override 
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����"); //������
		return Math.PI * r * r;
	}
	
	

}
