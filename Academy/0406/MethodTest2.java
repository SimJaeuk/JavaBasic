public class MethodTest2 {
    
    int a; // 객체변수 a
    
    public void vartest(){
        this.a++;
    }
    

    public static void main(String[] args) {
        MethodTest2 myTest = new MethodTest2();
        myTest.a = 1;
        myTest.vartest();
        System.out.println(myTest.a);
    }

}
