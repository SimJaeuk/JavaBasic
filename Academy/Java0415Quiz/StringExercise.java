public class StringExercise {
    
    String getMiddle(String word){
        int num = word.length()/2;
        // 글자의 개수로 홀수 짝수 파악
        if (word.length() % 2 == 0) { //짝수 케이스
            return word.substring(num-1, num+1);
        }else{ //홀수 케이스
            return word.substring(num, num+1);

        }
    }


    public static void main(String[] args) {
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
        System.out.println(se.getMiddle("test"));
    }
}
