package loop;

public class BreakLavelExam {

	public static void main(String[] args) {
		Lavel: for(char upper ='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower =='i') {
					break Lavel;
				}
			}
		}
		System.out.println("실행 종료");
		
		// Lavel을 활용해서 이중포문을 한번에 종료
	}

}
