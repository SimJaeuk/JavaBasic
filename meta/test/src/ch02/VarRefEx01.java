package ch02;

// new�� �Ǿ ���� �Ҵ��� �� �� ����� �� �� �ִ�. (���α׷��� ����Ǿ��� �� = Runtime)

class MyData {
	int id = 1; // 4Byte
	int price = 1000; // 4Byte
	
}

// ��������, �Ϲݺ���
public class VarRefEx01 {
	
	public static void main(String[] args) {
		// int num; -> ���� ����
		// int num = 10; -> ���� �ʱ�ȭ
		int num = 10; // �Ϲݺ��� -> ũ�Ⱑ ������ �ִ� �� (������ ����)
		MyData d = new MyData(); // �������� -> ũ�Ⱑ ������ ���� �ʴ� ��(������ ����)
		
		System.out.println(num);
		System.out.println(d.id);
		System.out.println(d.price);


	}

}
