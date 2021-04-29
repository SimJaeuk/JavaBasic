import java.util.*;

public class Quiz4 {

	public static void main(String[] args) {
		//7-1 입력한 int형 정숫값이 음수이면 -1을, 0이면 0을, 양수이면 1을 반환하는 signOf 메서드 작성
		
//	    Scanner sc = new Scanner(System.in);
//	    
//	    System.out.print("정수 x:");
//	    int x = sc.nextInt();
//	    
//	    int s = signOf(x);
//	    System.out.println("signOf(x)는 "+s+"입니다.");
//
//
//	} //main 닫기
//    
//	static int signOf(int n) {
//		if (n > 0) {
//	    	return 1;
//	    }else if (n == 0) {
//	    	return 0;
//	    }else
//	    	return -1;
//	}
	
		//7-2 3개의 int형 인수 a,b,c중 최솟값을 구하는 min 메서드를 작성
		
//		Scanner sc = new Scanner(System.in);
//		
//	    System.out.print("정수 a:");
//	    int a = sc.nextInt();
//	    
//	    System.out.print("정수 b:");
//	    int b = sc.nextInt();
//	    
//	    System.out.print("정수 c:");
//	    int c = sc.nextInt();
//	    
//	    int d = min(a, b, c);
//	    System.out.println("최솟값은"+d+"입니다.");
//	} //main 닫기
//	
//	static int min(int a, int b, int c) {
//		if (a < b && a < c) {
//			return a;
//		}else if (b < a && b < c) { 
//			return b;
//		}else {
//			return c;
//		}
	
	//7-2 3개의 int형 인수 a,b,c중 중간값을 구하는 med 메서드를 작성
		
//		Scanner sc = new Scanner(System.in);
//		
//	    System.out.print("정수 a:"); int a = sc.nextInt();
//	    System.out.print("정수 b:"); int b = sc.nextInt();
//	    System.out.print("정수 c:"); int c = sc.nextInt();
//	    
//	    int d = med(a, b, c);
//	    System.out.println("중간값은 "+d+"입니다.");
//	} //main 닫기
//	
	//내방법
//	static int med(int a, int b, int c) {
//		
//		if (a <= b && a >= c || a >= b && a <= c) {
//			return a;
//		}else if (b <= a && b >= c || b >= a && b <= c) { 
//			return b;
//		}else {
//			return c;
//		}
	
	//강사님 방법
//	static int med(int a, int b, int c){
//
//		  if (a >= b)
//		    if (b >= c)
//		      return b;
//		    else if (a <= c)
//		      return a;
//		    else
//		      return c;
//		  else if ( a > c)
//		    return a;
//		  else if (b>c)
//		    return c;
//		  else 
//		  return b;
	
	// 7-4  1부터 n까지의 정수의 합을 구해서 반환
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1부터 x까지의 합을 구하세요"); 
//		System.out.print("x의 값:"); int x = sc.nextInt();
//		System.out.print("1부터 "+x+"의 합은"+sumUp(x)+"입니다."); 
//
//		  }
//
//		static int sumUp(int n){
//		  int sum = 0;
//		  for (int i = 1; i <= n ; i ++)
//		    sum+=i;
//		  return sum;

		
		
	// 7-6 인수 m에 지정한 달의 계절을 표시하는 메서드를 작성하자. 봄(3,4,5), 여름(6,7,8) 가을(9,10,11), 겨울(12,1,2)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇 월입니까(1 ~ 12):"); 
//		int x = sc.nextInt();
//		System.out.print("해당 월의 계절은 "+season(x)+" 입니다.");
//		
//			
//	}
//	
//		static String season(int m){
//			
//		    switch (m){
//	        case 3: case 4: case 5: return "봄";       
//	        case 6: case 7: case 8: return "여름"; 
//	        case 9: case 10: case 11: return "가을";	            
//	        case 12: case 1: case 2: return "겨울";
//	        
//	        
//	    }
//			return "";
		
	// 7-7 문자 c를 n개 표시하는 putChar 메서드와 이 메서드를 내부에서 호출해서 문자 *를 n개 연속으로 표시하는
	// putStart 메서드를 작성하자. 또한 이 메서드를 사용해서 직삼각형을 만드는 프로그램을 작성
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
//		System.out.print("단수는:"); int n = sc.nextInt();
//		
//		for (int i = 1; i <= n ; i++) {
//			putStart(i);
//			System.out.println();
//		}
//		
//}	
//	
//	static void putStart(int n) {
//		putChars('*',n);
//	}
//	
//	static void putChars(char c, int n) {
//		while(n-- > 0)
//		System.out.print(c);
		
		//7-8 난수(a =< 난수 =<b)를 생성해서 반환하는 random 메서드를 작성하자. 메서드 안에서 
		//난수를 생성하는 표준 라이브러리를 호출할 것. (참고, b <= a인 경우 a값을 그대로 반환할 것)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("난수를 생성합니다.");
//		System.out.print("하한값:"); int a = sc.nextInt();
//		System.out.print("상한값:"); int b = sc.nextInt();
//		
//		System.out.println("생성한 난수는 "+random(a,b)+"입니다.");
//	
//	} //main
//	static int random(int a, int b) {
//		if (b <= a) {
//			return a;
//		}else {
//			Random rand = new Random();
//			return a + rand.nextInt(b-a+1);
//		}
//		
		//7-9 양의 정숫값 이라는 메세지에 정숫값을 입력하면 값을 거꾸로 반화하는 readPlusInt 메서드를 작성하자.
		//0이나 음수가 입력되면 재입력하도록 할 것.
//		Scanner sc = new Scanner(System.in);
//		int x = 0;
//		
//		do {
//		int n = readPlusInt();
//
//		System.out.print("반대로 읽으면 ");
//			while(n>0) {
//				System.out.print(n%10);
//				n = n / 10;
//			}
//		
//		System.out.println("입니다");
//		
//		do {
//			System.out.println("다시 한번?<Yes...1/No...0>");
//			x = sc.nextInt();
//			
//		}while(x!=0 && x!=1);
//	}while (x==1);
//		
//	} //main 닫기
//	
//	static int readPlusInt() {
//		Scanner sc = new Scanner(System.in);
//		int x;
//		do {
//			System.out.print("양의 정수값:");
//			x = sc.nextInt();
//		}while(x <= 0);
//		return x;
		
	//7-10 다음 4개의 계산 문제 중 하나를 무작위로 출제하는 암산 훈련프로그램을 작성하자.
	// 이때 x,y,z에 3자리의 정숫값을 난수로 생성할 것.
//	Scanner sc = new Scanner(System.in);
//	Random rand = new Random();
//	System.out.println("암산 훈련!!");
//	
//	do {
//	int x = 100 + rand.nextInt(900);
//	int y = 100 + rand.nextInt(900);
//	int z = 100 + rand.nextInt(900);
//	int p = rand.nextInt(4);
//	
//	
//	int answer = 0;
//	switch (p) {
//	case 0: answer =  x + y + z; break;
//	case 1: answer =  x + y - z; break;
//	case 2: answer =  x - y + z; break;
//	case 3: answer =  x - y - z; break;
//	}while(true){
//		System.out.print(x + ((p<2) ? "+" : "-")+y+(
//		(p%2==0) ? "+":"-")+z+"=");
//		
//		int k = sc.nextInt();
//		if (k==answer)
//			break;
//		System.out.println("틀렸습니다.");
//	}
//				
//	
//	}while(retry());
//		}
//	
//	static boolean retry() {
//		Scanner sc = new Scanner(System.in);
//		int cond;
//		do {
//			System.out.print("다시 한 번? <Yes...1/No...0> :");
//			cond = sc.nextInt();
//		}while (cond != 0 && cond != 1);
//		return cond == 1;
		
	// 7-19 배열 a에서 요소 a[idx]부터 n개의 요소를 삭제하는 aryRmvN 메서드를 작성하자.
	// 삭제는 a[idx]보다 뒤에 있는 요소를 하나씩 앞으로 이동해서 할 것, 이동 대상이 아닌 요소는 기존 값을 그대로 유지할 것.
	// 예) 배열 a의 요소가{1, 3, 4, 7, 9, 11}일 때 aryRmvN(a, 1, 3)라고 호출하면 
	// 배열 a의 요소는{1, 9, 11, 7, 9, 11}이 된다.
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("요소수 :");
	int n = sc.nextInt();
	
	int[] a = new int[n];
	
	for (int i = 0; i < n; i++) {
		System.out.print("a["+i+"]:");
		a[i] = sc.nextInt();
	}
	
	System.out.print("삭제를 시작할 인덱스 : ");
	int d = sc.nextInt();
	System.out.print("삭제할 요소의 개수 : ");
	int e = sc.nextInt();
	
	aryRmv(a,  d,  e);
	
	for (int i = 0; i < n; i++) {
		System.out.println("a["+i+"] = "+a[i]);
	}
		
	} // main
	
	static void aryRmv(int[] a, int d, int e) {
		if (e > 0 && d >= 0 && d+e < a.length);
		 int d2 = d + e - 1;
		 if (d2 > a.length - e - 1)
			 d2 = a.length-e-1;
		 for(int i = d; i <= d2; i++) {
			 a[i] = a[i+e];
		 }
	}

} //class 닫기
