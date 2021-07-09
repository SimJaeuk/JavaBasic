public class InnerExam3 {

    public void exec() {
        class Cal{
            int value = 0;
            public void plus() {
                value++;
            }
        }
        Cal cal = new Cal();
        cal.plus();
        System.out.println(cal.value);
    }

    public static void main(String[] args) {
        InnerExam3 t = new InnerExam3();
        t.exec();
        
    }
    
}
// 클래스를 메서드 안에서 지역 변수처럼 사용