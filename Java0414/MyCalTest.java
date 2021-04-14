public class MyCalTest {
    
    public static void main(String[] args) {
        Calculator cal = new MyCal();
        cal.plus(3, 4);
        int i = cal.exec(5, 6);
        System.out.println(i);
        
        System.out.println(Calculator.exec2(4,3));
    }
}
