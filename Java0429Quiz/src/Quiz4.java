import java.util.*;

public class Quiz4 {

	public static void main(String[] args) {
		//7-1 �Է��� int�� �������� �����̸� -1��, 0�̸� 0��, ����̸� 1�� ��ȯ�ϴ� signOf �޼��� �ۼ�
		
//	    Scanner sc = new Scanner(System.in);
//	    
//	    System.out.print("���� x:");
//	    int x = sc.nextInt();
//	    
//	    int s = signOf(x);
//	    System.out.println("signOf(x)�� "+s+"�Դϴ�.");
//
//
//	} //main �ݱ�
//    
//	static int signOf(int n) {
//		if (n > 0) {
//	    	return 1;
//	    }else if (n == 0) {
//	    	return 0;
//	    }else
//	    	return -1;
//	}
	
		//7-2 3���� int�� �μ� a,b,c�� �ּڰ��� ���ϴ� min �޼��带 �ۼ�
		
//		Scanner sc = new Scanner(System.in);
//		
//	    System.out.print("���� a:");
//	    int a = sc.nextInt();
//	    
//	    System.out.print("���� b:");
//	    int b = sc.nextInt();
//	    
//	    System.out.print("���� c:");
//	    int c = sc.nextInt();
//	    
//	    int d = min(a, b, c);
//	    System.out.println("�ּڰ���"+d+"�Դϴ�.");
//	} //main �ݱ�
//	
//	static int min(int a, int b, int c) {
//		if (a < b && a < c) {
//			return a;
//		}else if (b < a && b < c) { 
//			return b;
//		}else {
//			return c;
//		}
	
	//7-2 3���� int�� �μ� a,b,c�� �߰����� ���ϴ� med �޼��带 �ۼ�
		
//		Scanner sc = new Scanner(System.in);
//		
//	    System.out.print("���� a:"); int a = sc.nextInt();
//	    System.out.print("���� b:"); int b = sc.nextInt();
//	    System.out.print("���� c:"); int c = sc.nextInt();
//	    
//	    int d = med(a, b, c);
//	    System.out.println("�߰����� "+d+"�Դϴ�.");
//	} //main �ݱ�
//	
	//�����
//	static int med(int a, int b, int c) {
//		
//		if (a <= b && a >= c || a >= b && a <= c) {
//			return a;
//		}else if (b <= a && b >= c || b >= a && b <= c) { 
//			return b;
//		}else {
//			return c;
//		}
	
	//����� ���
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
	
	// 7-4  1���� n������ ������ ���� ���ؼ� ��ȯ
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1���� x������ ���� ���ϼ���"); 
//		System.out.print("x�� ��:"); int x = sc.nextInt();
//		System.out.print("1���� "+x+"�� ����"+sumUp(x)+"�Դϴ�."); 
//
//		  }
//
//		static int sumUp(int n){
//		  int sum = 0;
//		  for (int i = 1; i <= n ; i ++)
//		    sum+=i;
//		  return sum;

		
		
	// 7-6 �μ� m�� ������ ���� ������ ǥ���ϴ� �޼��带 �ۼ�����. ��(3,4,5), ����(6,7,8) ����(9,10,11), �ܿ�(12,1,2)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�� ���Դϱ�(1 ~ 12):"); 
//		int x = sc.nextInt();
//		System.out.print("�ش� ���� ������ "+season(x)+" �Դϴ�.");
//		
//			
//	}
//	
//		static String season(int m){
//			
//		    switch (m){
//	        case 3: case 4: case 5: return "��";       
//	        case 6: case 7: case 8: return "����"; 
//	        case 9: case 10: case 11: return "����";	            
//	        case 12: case 1: case 2: return "�ܿ�";
//	        
//	        
//	    }
//			return "";
		
	// 7-7 ���� c�� n�� ǥ���ϴ� putChar �޼���� �� �޼��带 ���ο��� ȣ���ؼ� ���� *�� n�� �������� ǥ���ϴ�
	// putStart �޼��带 �ۼ�����. ���� �� �޼��带 ����ؼ� ���ﰢ���� ����� ���α׷��� �ۼ�
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ǥ���մϴ�.");
//		System.out.print("�ܼ���:"); int n = sc.nextInt();
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
		
		//7-8 ����(a =< ���� =<b)�� �����ؼ� ��ȯ�ϴ� random �޼��带 �ۼ�����. �޼��� �ȿ��� 
		//������ �����ϴ� ǥ�� ���̺귯���� ȣ���� ��. (����, b <= a�� ��� a���� �״�� ��ȯ�� ��)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������ �����մϴ�.");
//		System.out.print("���Ѱ�:"); int a = sc.nextInt();
//		System.out.print("���Ѱ�:"); int b = sc.nextInt();
//		
//		System.out.println("������ ������ "+random(a,b)+"�Դϴ�.");
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
		//7-9 ���� ������ �̶�� �޼����� �������� �Է��ϸ� ���� �Ųٷ� ��ȭ�ϴ� readPlusInt �޼��带 �ۼ�����.
		//0�̳� ������ �ԷµǸ� ���Է��ϵ��� �� ��.
//		Scanner sc = new Scanner(System.in);
//		int x = 0;
//		
//		do {
//		int n = readPlusInt();
//
//		System.out.print("�ݴ�� ������ ");
//			while(n>0) {
//				System.out.print(n%10);
//				n = n / 10;
//			}
//		
//		System.out.println("�Դϴ�");
//		
//		do {
//			System.out.println("�ٽ� �ѹ�?<Yes...1/No...0>");
//			x = sc.nextInt();
//			
//		}while(x!=0 && x!=1);
//	}while (x==1);
//		
//	} //main �ݱ�
//	
//	static int readPlusInt() {
//		Scanner sc = new Scanner(System.in);
//		int x;
//		do {
//			System.out.print("���� ������:");
//			x = sc.nextInt();
//		}while(x <= 0);
//		return x;
		
	//7-10 ���� 4���� ��� ���� �� �ϳ��� �������� �����ϴ� �ϻ� �Ʒ����α׷��� �ۼ�����.
	// �̶� x,y,z�� 3�ڸ��� �������� ������ ������ ��.
//	Scanner sc = new Scanner(System.in);
//	Random rand = new Random();
//	System.out.println("�ϻ� �Ʒ�!!");
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
//		System.out.println("Ʋ�Ƚ��ϴ�.");
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
//			System.out.print("�ٽ� �� ��? <Yes...1/No...0> :");
//			cond = sc.nextInt();
//		}while (cond != 0 && cond != 1);
//		return cond == 1;
		
	// 7-19 �迭 a���� ��� a[idx]���� n���� ��Ҹ� �����ϴ� aryRmvN �޼��带 �ۼ�����.
	// ������ a[idx]���� �ڿ� �ִ� ��Ҹ� �ϳ��� ������ �̵��ؼ� �� ��, �̵� ����� �ƴ� ��Ҵ� ���� ���� �״�� ������ ��.
	// ��) �迭 a�� ��Ұ�{1, 3, 4, 7, 9, 11}�� �� aryRmvN(a, 1, 3)��� ȣ���ϸ� 
	// �迭 a�� ��Ҵ�{1, 9, 11, 7, 9, 11}�� �ȴ�.
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("��Ҽ� :");
	int n = sc.nextInt();
	
	int[] a = new int[n];
	
	for (int i = 0; i < n; i++) {
		System.out.print("a["+i+"]:");
		a[i] = sc.nextInt();
	}
	
	System.out.print("������ ������ �ε��� : ");
	int d = sc.nextInt();
	System.out.print("������ ����� ���� : ");
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

} //class �ݱ�
