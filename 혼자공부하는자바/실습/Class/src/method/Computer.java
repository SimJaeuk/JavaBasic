package method;

public class Computer {

	// �Ű� ������ ������ �� ���
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	// �޼ҵ��� �Ű� ������ ...�� ����ؼ� �����ϸ� ȣ�� �� �ڵ����� �迭�� ����
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
