package ch03;

public class OperEx05 {

	public static void main(String[] args) {
		// ���� ������ -> ���� ������
		int n1 = 5;
		
		// ����(�񱳿�����) ? true : false
		System.out.println(n1==5 ? "5�� �´�" : "5�� �ƴϴ�.");
		
		int point = 59;
		System.out.println(point >= 60 ? "���" : "�����");
		
		String result = point >= 60 ? "���" : "�����"; 
		System.out.println("��� : " + result);
		
		boolean result2 = 1==1;
		System.out.println("��� : " + result2);
		
		int result3 = point < 60 ? 0 : 1;
		System.out.println("��� : "+ result3);
		
	}

}
