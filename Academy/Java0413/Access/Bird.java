public abstract class Bird {
    
    public abstract void sing();

    public void fly() {
        System.out.print("날다.");
    }

    // 추상 클래스 정의하기
    //  추상 클래스는 클래스 앞에 abstract 키워드를 넣어 정의한다.
    //  추상 클래스는 미완성의 추상 메서드를 포함할 수 있다.
    //  추상 메서드란 내용이 없는 메서드다. 즉, 구현되지 않은 메서드다.
    //  추상 메서드는 리턴형 앞에 abstract 키워드를 붙여야 한다.
    //  추상 메서드는 객체를 생성할 수 없다.
}
