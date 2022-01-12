package ch04;

public class CatApp {

	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		System.out.println(c1.name); // null 자체도 데이터 -> 값이 없음을 의미
		System.out.println(c1.color);
	}

}
