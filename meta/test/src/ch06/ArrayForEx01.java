package ch06;

public class ArrayForEx01 {
	
	static void �����ݾװ��(int[] coin, int restMoney) {
		for(int i=0; i<4; i++) {
			System.out.println(coin[i] + "�� : " + (restMoney/coin[i])); // 180�� ����
			restMoney = restMoney%coin[i];
			System.out.println("�����ݾ� : " + restMoney);
		}
	}
	
	
	public static void main(String[] args) {
		int[] coin = {500, 100, 50, 10};
		int money = 1390;
		int restMoney = money;
		
		// �Ʒ��� ���� 4���� �迭�� for���� �̿��ؼ� �����ϱ�
		�����ݾװ��(coin, restMoney);
		
		
	}
}
