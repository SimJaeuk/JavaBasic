package set;

import java.util.*;
public class HashSetExam {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("JAVA"); //중복 저장되지 않음
		set.add("iBATIS");
		
		int size = set.size(); //저장된 객체 수 얻기
		System.out.println("총 객체수: " + size);
		
		Iterator<String> iterator = set.iterator(); //반복자 얻기
		while(iterator.hasNext()) { //객체 수만큼 루핑
			String element = iterator.next(); //1개의 객체를 가져옴
			System.out.println("	" + element);
		}
		
		//객체 삭제
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수 :" + set.size());
		
		iterator = set.iterator(); //반복자 얻기
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) { System.out.println("비어 있음"); }
	}

}
