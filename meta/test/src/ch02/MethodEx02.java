package ch02;

public class MethodEx02 {

	// void -> �������� �ʰڴ�.
	static int add() { // ȣ���� �Ǹ� �߰�ȣ ���ΰ� ����, �̶� Stack ������ �޸𸮿� �������
		int sum = 5+6;
//		System.out.println(sum);
		return sum;
	}
	
	public static void main(String[] args) {
		int result = add(); // add() �޼��� ȣ��
		System.out.println(result);
	}

}
