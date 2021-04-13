package Access;

public class AccessObj {
    // 어떤 클래스든 접근할 수 있음 (전체 공개)
    public int p = 3;
    // 같은 패키지인 경우만 접근을 허용 
    // 단 상속받은 경우 다른 패키지도 접근 가능
    protected int p2 = 4;
    // 자기 자신만 접근 가능
    private int i = 1;
    // default ->  패키지 내에서 접근 가능
    int k = 2;




}
