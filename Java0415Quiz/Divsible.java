import java.util.Arrays;

public class Divsible {
    public int[] divisible(int[] array, int divisor) {
        // 배열의 개수를 미리 파악해야만 배열을 생성할 수 있다.
        int num = 0; 
        
        for (int i = 0; i < array.length; i++){
            if(array[i] % divisor == 0){ // 조건에 만족하는지 검사
                num++; //조건에 만족하는 갯수 증가
            }   
        }
    
        int[] narray = new int[num];
        int index = 0;
        for (int j = 0; j<array.length; j++){
            if(array[j] % divisor == 0){
                narray[index++] = array[j];
            }
                 
    }
        return narray;
}

    public static void main(String[] args) {
        Divsible div = new Divsible();
        int[] array = {5, 9, 8, 10};
        System.out.println( Arrays.toString( div.divisible(array, 5) ));
    }
}