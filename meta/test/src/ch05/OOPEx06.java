package ch05;

class �����佺����{
	String name = "�����佺����";
	void �⺻����(�����佺���� e1) {}
	
	String �̸�Ȯ��() {
		return "?";
	}
}

class ���� extends �����佺����{
	String name = "����";
	
	// �������̵� = �θ��� �޼��带 ��ȿȭ�ϴ�.
	void �⺻����(�����佺���� e1) {
		System.out.println(this.name + "�� "+e1.�̸�Ȯ��()+"�� �����մϴ�.");
	}
	
	// �������̵�
	String �̸�Ȯ��() {
		return name;
	}
}

class ��� extends �����佺����{
	String name = "���";
	void �⺻����(�����佺���� e1) {
		System.out.println(this.name + "�� "+e1.�̸�Ȯ��()+"�� �����մϴ�.");
	}
	
	String �̸�Ȯ��() {
		return name;
	}
}

class ��ũ���÷� extends �����佺����{
	String name = "��ũ���÷�";
	void �⺻����(�����佺���� e1) {
		System.out.println(this.name + "�� "+e1.�̸�Ȯ��()+"�� �����մϴ�.");
	}
	
	String �̸�Ȯ��() {
		return name;
	}
}


// ������� ������ �ϳ� ������ (�������̵�)
class ���� extends �����佺����{
	String name = "����";
	void �⺻����(�����佺���� e) {
		System.out.println(this.name + "�� "+e.�̸�Ȯ��()+"�� �����մϴ�.");
	}
	
	String �̸�Ȯ��() {
		return name;
	}
}

public class OOPEx06 {

	public static void main(String[] args) {
		�����佺���� u1 = new ����(); // (����, �����佺����)
		�����佺���� u2 = new ���(); // (���, �����佺����)
		�����佺���� u3 = new ��ũ���÷�(); // (��ũ���÷�, �����佺����)
		�����佺���� u4 = new ����(); // (����, �����佺����)
		
		u1.�⺻����(u2);
		u4.�⺻����(u2);
		
	}

}
