package object.hashCode;

import java.util.HashMap;

public class KeyExam {

	public static void main(String[] args) {
		//Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//�ĺ�Ű new Key(1)�� "���ڹ�"�� ������
		hashMap.put(new Key(1), "���ڹ�");
		
		//�ĺ�Ű�� "���ڹ�"�� �о��
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		
	}

}
