package object.equlas;

public class MemberExam {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("�� ��ü�� �����մϴ�.");
		}else {
			System.out.println("�� ��ü�� �������� �ʽ��ϴ�.");
		}
		
		
		if(obj1.equals(obj3)) {
			System.out.println("�� ��ü�� �����մϴ�.");
		}else {
			System.out.println("�� ��ü�� �������� �ʽ��ϴ�.");
		}

	}

}
