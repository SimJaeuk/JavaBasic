import java.security.cert.X509CRL;

public class Car{
    String name;
    int number;

    public void run() {
        System.out.println("달리다.");
    }

    public void run(int x) {
        System.out.println("차가 시속 "+x+"km로 달립니다."); 
    }

    public Car(){
        // this.name = "이름없음";
        // this.number = 0;
        this("이름없음",0);  //생성자호출
        // car("이름없음",0);
    }
    
    public Car(String name){
        // this.name = name;
        // this.name = name;
        this(name,0);
    }
    
    public Car(String name, int number){
        this.name = name;
        this.number = number;
    }   


}