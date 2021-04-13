public class VariableScopeExam {
    int globalScope = 10;
    static int staticVal = 7;

    public void scopeTest(int value){
        int localScope = 20;

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);

    }

    public void scopeTest2(int value2) {
        System.out.println(globalScope);
        // System.out.println(localScope); 
        // System.out.println(value);      
        System.out.println(value2);
    }

    public static void main(String[] args) {
        System.out.println(staticVal);
        
        VariableScopeExam v1 = new VariableScopeExam();
        System.out.println(v1.globalScope); 
        VariableScopeExam v2 = new VariableScopeExam();
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);
        v1.staticVal = 50;
        v2.staticVal = 100;
        System.out.println(v1.staticVal);
        System.out.println(v2.staticVal);
        // static한 필드는 인스턴스를 생성할 때 만들어지지 않음
        // 값을 저장할 수 있는 공간도 하나 
        // static은 값을 공유하는 변수

    }  
        
    
    
}
