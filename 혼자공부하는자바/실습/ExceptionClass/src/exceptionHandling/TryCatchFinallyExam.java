package exceptionHandling;

public class TryCatchFinallyExam {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("Java.lang.String2");
		}catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}

	}

}
