import java.util.*;

public class Quiz5 {

	

		
// 10-6 �Ǽ����� �о ���񰪰� �������� ���ϰ�, �ش� ���� ���������� �ϴ� ���� ���� ���ϱ�
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.print("�Ǽ���:");
//	double a = sc.nextDouble();	
//	
//	System.out.println("����:" + Math.abs(a));
//	System.out.println("������:" + Math.sqrt(a)); 
//	System.out.println("�� ��:" + Math.PI*a*a);
	
// 15-4 ���ڿ��� �о �� ���ڿ��� �������� ǥ���ϴ� ���α׷��� �ۼ�����.
	
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.print("���ڿ�:"); String s = sc.nextLine();
//	System.out.print("�ݴ�� ������:");
//	for(int i = s.length()-1 ; i >= 0; i--) {
//		System.out.print(s.charAt(i));
//	}
//	
//	System.out.print("�Դϴ�. ");
	
// 15-6 ���ڿ� s1 �ȿ� ���ڿ� s2�� ���Եƴ��� Ȯ���ϴ� ���α׷��� �ۼ�
// ���Ե� ���� ������ "s1 �ȿ� s2�� ���Ե� ���� �ʽ��ϴ�. ��� ǥ���ϰ� ���Ե� ���� ��ġ�ϴ� �κ���
// ���Ʒ� ���ĵǵ��� ��η� ǥ���� ��.
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���ڿ� s1:");
	String s1 = sc.nextLine();
	
	System.out.print("���ڿ� s2:");
	String s2 = sc.nextLine();
	
	int idx = s1.indexOf(s2);
	if (idx==-1){
		System.out.println("s1�ȿ� s2�� ���ԵǾ����� �ʽ��ϴ�.");
	}else{
		System.out.println(s1);
	for (int i =0; i < idx; i++) System.out.print(" ");
		System.out.println((s2));
	}
	
	
	
	
	
	


	
	
	
	
	}

} 
		

