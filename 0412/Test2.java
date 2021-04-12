public class Test2 {
    public void sayNick(String nick) throws FoolException {
        if("fool".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");

}
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        try {
            test2.sayNick("fool");
            test2.sayNick("genious");
        }catch(FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }
    }
}