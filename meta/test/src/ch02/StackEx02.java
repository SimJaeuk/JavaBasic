package ch02;

/*
 * ���� : Stack(�������� = �޼��尡 ����� �� �޸𸮿� �Ҵ� -> �޼��尡 ����� �� �޸𸮿��� �����)
 * 	   : Heap(�������� = new�Ҷ� �޸𸮿� �Ҵ� -> ���̻� �������� ���� �� �޸𸮿��� �����)
 *     : Static(�������� = main�޼��尡 ����Ǳ� ���� �޸𸮿� �Ҵ� -> main �޼��尡 ����Ǹ� �޸𸮿��� �����)
 */

public class StackEx02 {

	static int sum = 20; // �������� (static) -> main�޼��尡 ���۵Ǳ����� sum �Ҵ�
	int value = 50; // �������� (heap) // �� �̻� �������� ���� �� �ڵ����� �����
	
	static void a() {
		// a �޼��尡 ����� �� stack������ n1�� �Ҵ�ǰ� a�޼��尡 ����Ǹ� �޸𸮿��� �����
		int n1 = 1; // a �޼����� ���ÿ����� ����� (��������) (stack)
		System.out.println(n1);
		
//		21�� ������ ����Ƿ��� �� �� static ������ �Ҵ��ؾ� �ϴµ� �Ұ���. -> static ���� �Ҵ��� main�޼��� ���� ������ ����
//		static int n2 = 2;
	}
	
	public static void main(String[] args) {
		a();
//		System.out.println(n1);
		System.out.println(sum);
		StackEx02 s = new StackEx02(); // 17�� ���ο��� heap������ value�� �Ҵ�
		System.out.println(s.value);
		System.out.println("test1 - �� �̻� s ������ �������� �ʱ� ������ �޸𸮿��� �����");
		System.out.println("test2");
		
	}

}
