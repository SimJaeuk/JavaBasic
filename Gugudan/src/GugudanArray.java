
public class GugudanArray {
	public static void main(String[] args) {
		int[] result = new int[9];
		for (int i = 2; i < 10; i++) {
			
			for (int j = 0; j < result.length; j++) {
				result[j] = i * (j + 1);
			}
		
			for (int k = 0; k < result.length; k++) {
			System.out.println(result[k]);
			}
		}

	}
}