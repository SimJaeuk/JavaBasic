public class Taxi implements Meter {
    // 1. Meter 인터페이스의 start와 stop 메서드를 구현

    // @Override
    // public void start() {
    //     System.out.println("주행시작");
    // }
    
    // @Override
    // public int stop(int distance) {
    //     return distance * 2;
    // }
    
    public void start() {
        System.out.println("운행을 시작합니다.");
    }

    public int BASE_FARE = 3000;
    public int stop(int distance) {
        int fare = BASE_FARE + distance * 2;
        System.out.println("운행을 종료합니다. 요금은 " + fare + "원입니다.");
        return fare;
    }
}

