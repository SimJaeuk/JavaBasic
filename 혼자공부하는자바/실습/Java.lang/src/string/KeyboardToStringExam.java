package string;

import java.io.IOException;

public class KeyboardToStringExam {

	public static void main(String[] args) throws IOException{
		//���� ����Ʈ�� ����
		byte[] bytes = new byte[100];
		
		System.out.print("�Է�: ");
		//�迭�� ���� ����Ʈ�� ���� �� ���� ����Ʈ ���� ����
		int readByteNo = System.in.read(bytes);
		
		//�迭�� ���ڿ��� ��ȯ
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
		

	}

}
