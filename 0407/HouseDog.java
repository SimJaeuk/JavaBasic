public class HouseDog extends Dog {

    public HouseDog(String name) {
        this.setName(name);
    }
      // 생성자 : 1. 이름이 클래스명과 동일
      //          2. return 없다.

    public HouseDog(int type) {
        if(type == 1){
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
        else{
            this.setName("mix");
        }
    }

    public void sleep() {
        System.out.println(this.name+" zzz in house");
        //메소드 오버라이딩
    }

    public void sleep(int hour) {
        System.out.println(this.name+" zzz in house for "+ hour + " hours");
    }
        //메소드 오버로딩
    

    public static void main(String[] args){
        HouseDog dog = new HouseDog("happy");
        HouseDog yorkshire = new HouseDog(1);

        System.out.println(dog.name);
        System.out.println(yorkshire.name);
    }
}

// 생성자가 선언된 경우 생성자의 규칙대로만 객체를 생성할 수 있다.