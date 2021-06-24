package loop;

public class ContinueExam {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		//continue를 통해 홀수는 점프
	}

}
