public class MethodTest {

    // 1. 입력과 리턴이 모두 있는 매소드
    public int sum(int a, int b) {
        return a+b;
    }
    // 2. 입력이 없는 리턴만 있는 매소드
    public String say() {
        return "Hi";
    }
    // 3. 입력은 있고 리턴은 없는 매소드
    // 돌려주는 값은 return 명령어로만 가능하다.
    public void sum2(int e, int f) {
        System.out.println(e+"과"+f+"의 합은 "+(e+f)+"입니다."); 
    }
    // 4. 입력도 없고 리턴도 없는 매소드
    public void say2() {
        System.out.println("Hi");
    }

    //3,4 그저 찍어줄 뿐 
    

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        MethodTest myTest = new MethodTest();
        int c = myTest.sum(a, b);
        System.out.println(c);

        String d = myTest.say();
        System.out.println(d);
        
        myTest.sum2(3, 4);
        
        myTest.say2();
    }
}
