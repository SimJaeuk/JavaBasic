package map;

import java.util.*;

public class HashMapExam2 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		//�й��� �̸��� ������ Student�� Ű�� ����
		map.put(new Student(1, "ȫ�浿"), 95);
		map.put(new Student(1, "ȫ�浿"), 95);
		
		System.out.println("�� Entry ��: " + map.size()); //����� �� Map.Entry�� ���

	}

}
