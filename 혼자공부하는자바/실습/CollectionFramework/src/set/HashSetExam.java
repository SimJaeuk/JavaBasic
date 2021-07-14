package set;

import java.util.*;
public class HashSetExam {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("JAVA"); //�ߺ� ������� ����
		set.add("iBATIS");
		
		int size = set.size(); //����� ��ü �� ���
		System.out.println("�� ��ü��: " + size);
		
		Iterator<String> iterator = set.iterator(); //�ݺ��� ���
		while(iterator.hasNext()) { //��ü ����ŭ ����
			String element = iterator.next(); //1���� ��ü�� ������
			System.out.println("	" + element);
		}
		
		//��ü ����
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("�� ��ü�� :" + set.size());
		
		iterator = set.iterator(); //�ݺ��� ���
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) { System.out.println("��� ����"); }
	}

}
