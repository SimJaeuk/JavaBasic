class Updater{
    // public void update(int count) {
    //     count++;
    public void update(Counter counter) { // 객체 자체를 전달 받음
        counter.count++;
    }
}

public class Counter {
    int count = 0; // 객체변수
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println("after update:"+myCounter.count);
    }   // 0출력 -> 1출력
    
}

//메소드에 값(primitive type)을 전달하는 것과 
//객체(reference type)를 전달하는 것에는 큰 차이가 있다.
//변수로 전달 -> 객체로 전달 (값을 유지할 수 있다.)