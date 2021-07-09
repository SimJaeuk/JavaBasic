public class IfExam {
    public static void main(String[] args) {
        int x = 50;
        int y = 60;

        //언제나 조건에 괄호처리를 하자
        //한줄은 언넣어도 되지만 혼란스러우니까
        if(x == y) {
            System.out.println("x는 y와 같습니다.");
        }else if(x > y){
            System.out.println("x는 y보다 큽니다.");
        }else {
            System.out.println("x는 y와 다릅니다.");
        }
        
    }
    
}
