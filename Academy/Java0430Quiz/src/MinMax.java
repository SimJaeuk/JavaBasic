import java.util.*;


// 10-7 �ּҰ� �ִ밪 ���ϱ�

public class MinMax {
	//2���� �ּҰ� ã�� �޼ҵ� (�޼ҵ� �����ε�)
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
	
	//�迭���� �ּҰ��� ������ ��� ����� �ε����� ������ �迭 ���ϱ�
	
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
		//@SuppressWarnings("resource")  �ݱ� ���� ������ �ڿ� ��뿡 ���õ� ��� ����
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("a��:");
		int a = sc.nextInt();
		
		System.out.print("b��:");
		int b = sc.nextInt();
		
		System.out.print("c��:");
		int c = sc.nextInt();
		
		System.out.print("�迭 a�� ��� ��:");
		int n = sc.nextInt();
		
		int[] x = new int[n];		
		for (int i = 0; i < n; i++) {
			System.out.print("x["+i+"]:");
			x[i] = sc.nextInt();
		}
		
		System.out.println("x,y�� �ּҰ���" + min(a, b) + " �Դϴ�. ");
		System.out.println("x,y�� �ִ밪��" + max(a, b) + " �Դϴ�. ");
		System.out.println("x,y,z�� �ּҰ���" + min(a, b, c) + " �Դϴ�. ");
		System.out.println("x,y,z�� �ִ밪��" + max(a, b, c) + " �Դϴ�. ");
		
		int xmin[] = minIndexArr(x);
		System.out.println("�迭 a�� �ּҰ��� " + min(x)+ "�Դϴ�.");
		System.out.println("�迭 a�� �ִ밪�� " + max(x)+ "�Դϴ�.");
		System.out.print("�ε����� { ");
		for (int i = 0; i < xmin.length; i++)
			System.out.print(xmin[i] +" ");
		
		System.out.println("}�Դϴ�.");

		sc.close();  // Resource leak: 'scan' is never closed (��ĳ�� �ݾ��ֱ�)
		
	}

}


	

