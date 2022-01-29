package ch06;

public class ForEx03 {

	public static void main(String[] args) {
		for(int i=2; i<10; i=i+1) { // ±¸±¸´Ü
			for(int j=1; j<10; j=j+1) {
				System.out.println(i+"*"+j+"="+j*i);
			}
			System.out.println("===========================");
		}
	}

}
