package classextends;

public class DmbCellPhoneExam {

	public static void main(String[] args) {
		//DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		//CellPhone Ŭ�������� ��ӹ��� �ʵ�
		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("�÷� : " + dmbCellPhone.color);
		
		//DmbCellPhone Ŭ������ �ʵ�
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
		//CellPhone Ŭ�����κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������?");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ���ڹ��ε���.");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
				
		//DmbCellPhone Ŭ������ �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
	}
		
	
	
}
