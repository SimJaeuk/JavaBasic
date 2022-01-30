package ch06;

public class ConEx04 {

	public static void main(String[] args) {
		// 연습문제 1
		int i = 1;
		
		while(i<11) {
			if(i==6) {
				i++;
			}
			System.out.println(i);
			i++;
		}
		
		System.out.println("========================");
		// 연습문제 2
		int n = 10;
		
		while(n>0) {
			if(n==3) {
				n--;
			}
			System.out.println(n);
			n--;
		}
		
		System.out.println("========================");
		
		// 연습문제3-1
		for(i=2; i<21; i=i+2) {
			System.out.println(i);
		}
		
		System.out.println("========================");
		
		// 연습문제3-2
		for(i=1; i<21; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}

