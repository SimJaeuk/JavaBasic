package set;

import java.util.*;

public class HashSetExam2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		//�ν��Ͻ��� �ٸ����� ���� �����Ͱ� �����ϹǷ� 1���� ��ü�� ����
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 30));
		
		System.out.println("�� ��ü�� : " + set.size()); //����� ��ü �� ���

	}

}
