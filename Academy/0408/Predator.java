public abstract class Predator extends Animal{

    public abstract String getFood();

    public boolean isPredator() {
        return true;

    //getFood라는 메소드는 인터페이스를 implements한 
    //클래스들이 구현해야 하는 것
    
    //추상클래스는 인터페이스로도, 상속으로도 사용할 수 있다.
    }
}