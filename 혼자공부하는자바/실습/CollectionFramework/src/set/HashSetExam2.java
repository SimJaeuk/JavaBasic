package set;

import java.util.*;

public class HashSetExam2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		//인스턴스가 다르지만 내부 데이터가 동일하므로 1개의 객체만 저장
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체수 : " + set.size()); //저장된 객체 수 얻기

	}

}
