package Array;

public class ArrayCreateNewExam3 {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for(int i=0; i < 3 ; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i] );
		}
	arr1[0] = 10;
	arr1[1] = 20;
	arr1[2] = 30;
	for(int i=0; i < 3 ; i++) {
		System.out.println("arr1[" + i + "] : " + arr1[i] );
	}

	// int로 new 배열을 생성할 경우 초기값은 0이고 이후에 대입가능
	}
}
