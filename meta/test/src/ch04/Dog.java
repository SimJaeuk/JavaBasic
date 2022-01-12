package ch04;

// 클래스 = 여러가지 특징(상태) 보유
// int -> 한가지의 상태만 가질 수 있음
// String -> 한가지의 상태만 가질 수 있음

public class Dog {
	int age = 20; // 변경 가능
	String name = "다투"; // 변경 가능 
	String color = "하얀색"; // 변경 가능
	final String type = "말티즈"; // 변경 불가능 -> 상수
}

// 변수, 필드, 전역변수, 힙변수, 상태 (지역변수가 아님 -> 메서드 내부에서 만들어진 변수가 아님)