public class HouseDog extends Dog {
    public void sleep() {
        System.out.println(this.name+" zzz in house");
        //메소드 오버라이딩
    }

    public void sleep(int hour) {
        System.out.println(this.name+" zzz in house for "+ hour + " hours");
    }
        //메소드 오버로딩

    public void sleep(int hour, int min){
        System.out.println(this.name+" zzz in house for "+ hour + " hours" + min + " minutes");

    }

    public static void main(String[] args){
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy"); // animal 조부모님 기능
        houseDog.sleep();          // dog 부모님 기능
        houseDog.sleep(3);         // sleep(int hour) 메소드 호출
        houseDog.sleep(4, 30);
    }
}
