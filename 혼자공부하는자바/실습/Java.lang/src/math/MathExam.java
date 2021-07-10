package math;

public class MathExam {

	public static void main(String[] args) {
		//절대값
		int v1 = Math.abs(-5);
		System.out.println(v1);
		
		//올림
		double v2 = Math.ceil(5.3);
		System.out.println(v2);
		
		//내림
		double v3 = Math.floor(5.3);
		System.out.println(v3);

		//가까운 정수의 실수값
		double v4 = Math.rint(5.3);
		double v5 = Math.rint(5.7);
		System.out.println(v4);
		System.out.println(v5);

		//반올림
		long v6 = Math.round(5.3);
		long v7 = Math.round(5.7);
		System.out.println(v6);
		System.out.println(v7);
		
		//랜덤 난수 발생 (0.0 ~ 1.0사이)
		double rn = Math.random();
		System.out.println(rn);

		
		double rn2 = Math.random() * 10;
		System.out.println(rn2);

		int rn3 = (int) (Math.random() * 100 + 1);
		System.out.println(rn3);
		
		
		
	}

}
