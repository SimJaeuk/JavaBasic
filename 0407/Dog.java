public class Dog extends Animal {
    
    public Dog() {
    }
    // 만약 클래스에 생성자가 하나도 없다면 컴파일러는 
    // 자동으로 위와같은 디폴트 생성자를 추가한다.

    public void sleep() {
        System.out.println(this.name+" zzz");
    }

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
    }
    
}
