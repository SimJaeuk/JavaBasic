import java.util.*;

public class Quiz5 {

	

		
// 10-6 실수값을 읽어서 절댓값과 제곱근을 구하고, 해당 값을 반지름으로 하는 원의 면적 구하기
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.print("실수값:");
//	double a = sc.nextDouble();	
//	
//	System.out.println("절댓값:" + Math.abs(a));
//	System.out.println("제곱근:" + Math.sqrt(a)); 
//	System.out.println("면 적:" + Math.PI*a*a);
	
// 15-4 문자열을 읽어서 그 문자열을 역순으로 표시하는 프로그램을 작성하자.
	
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.print("문자열:"); String s = sc.nextLine();
//	System.out.print("반대로 읽으면:");
//	for(int i = s.length()-1 ; i >= 0; i--) {
//		System.out.print(s.charAt(i));
//	}
//	
//	System.out.print("입니다. ");
	
// 15-6 문자열 s1 안에 문자열 s2가 포함됐는지 확인하는 프로그램을 작성
// 포함돼 있지 않으면 "s1 안에 s2가 포함돼 있지 않습니다. 라고 표시하고 포함된 경우는 일치하는 부분을
// 위아래 정렬되도록 라로로 표시할 것.
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("문자열 s1:");
	String s1 = sc.nextLine();
	
	System.out.print("문자열 s2:");
	String s2 = sc.nextLine();
	
	int idx = s1.indexOf(s2);
	if (idx==-1){
		System.out.println("s1안에 s2가 포함되어있지 않습니다.");
	}else{
		System.out.println(s1);
	for (int i =0; i < idx; i++) System.out.print(" ");
		System.out.println((s2));
	}
	
	
	
	
	
	


	
	
	
	
	}

} 
		

