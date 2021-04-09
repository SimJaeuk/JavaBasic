public class ForEachExam {
    public static void main(String[] args) {
        int[] iarr = {10,20,30,40,50};

        // 일반 for문
        // for(int i = 0; i < iarr.length; i++) {
        //     int value = iarr[i];
        //     System.out.println(value);
        // }
        // for each문
        
        for(int value:iarr){
            System.out.println(value);
        }
    }

    
}
