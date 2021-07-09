import java.util.*;


// 10-7 최소값 최대값 수하기

public class MinMax {
	//2개중 최소값 찾기 메소드 (메소드 오버로딩)
	public static int min(int a, int b) {
//		if (a <= b) {
//			return a;
//		}else {
//			return b;
//		}
		return a < b ? a : b;
}
	
	public static int min(int a, int b, int c) {
		if (a <= b && a <= c) {
			return a;
		}else if (b <= a && b <= c) { 
			return b;
		}else {
			return c;
		}
}
	
	public static int min(int[] x) {
		int min = x[0];
		for (int i = 1 ; i < x.length ; i++) {
			if (x[i]< min) min = x[i];
		}
		return min;
		
}
	
	public static int max(int a, int b) {
//		if (a <= b){
//			return b;
//		}else
//			return a;
//		}
		return a > b ? a : b;
}

	public static int max(int a, int b, int c) {
		
		if (a >= b && a >= c) {
			return a;
		}else if (b >= a && b >= c) { 
			return b;
		}else {
			return c;
		}
	}
	
	public static int max(int[] x) {
		int max = x[0];
		for (int i = 1 ; i < x.length ; i++) {
			if (x[i] > max) max = x[i];
		}
		return max;
	}
	
	//배열에서 최소값을 가지는 모든 요소의 인덱스를 저장한 배열 구하기
	
	public static int[] minIndexArr(int[] x) {
		int min = min(x);
		int count = 0;
		for(int i = 0 ; i < x.length; i++) {
			if(x[i] == min)
				count++;
		}
		int[] c = new int[count--];
		for (int i = x.length-1; count >=0;i--) {
			if (x[i] == min)
				c[count--]= i;
			}
		return c;
		}
	
	
	


	public static void main(String[] args) {
		//@SuppressWarnings("resource")  닫기 가능 유형의 자원 사용에 관련된 경고 억제
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("a값:");
		int a = sc.nextInt();
		
		System.out.print("b값:");
		int b = sc.nextInt();
		
		System.out.print("c값:");
		int c = sc.nextInt();
		
		System.out.print("배열 a의 요소 수:");
		int n = sc.nextInt();
		
		int[] x = new int[n];		
		for (int i = 0; i < n; i++) {
			System.out.print("x["+i+"]:");
			x[i] = sc.nextInt();
		}
		
		System.out.println("x,y의 최소값은" + min(a, b) + " 입니다. ");
		System.out.println("x,y의 최대값은" + max(a, b) + " 입니다. ");
		System.out.println("x,y,z의 최소값은" + min(a, b, c) + " 입니다. ");
		System.out.println("x,y,z의 최대값은" + max(a, b, c) + " 입니다. ");
		
		int xmin[] = minIndexArr(x);
		System.out.println("배열 a의 최소값은 " + min(x)+ "입니다.");
		System.out.println("배열 a의 최대값은 " + max(x)+ "입니다.");
		System.out.print("인덱스는 { ");
		for (int i = 0; i < xmin.length; i++)
			System.out.print(xmin[i] +" ");
		
		System.out.println("}입니다.");

		sc.close();  // Resource leak: 'scan' is never closed (스캐너 닫아주기)
		
	}

}


	

