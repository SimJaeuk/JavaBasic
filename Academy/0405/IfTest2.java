import java.util.ArrayList;

public class IfTest2 {
    public static void main(String[] args) {
    boolean hasCard = true;
    ArrayList<String> pocket = new ArrayList<String>();
    pocket.add("paper");
    pocket.add("handphone");
    

    if (pocket.contains("money")) {
        System.out.println("택시를 타고 가라");
    }else if (hasCard) {
        System.out.println("택시를 타고 가라");
    }else {
        System.out.println("걸어가라");
    }

    }
}

//contains pocket 리스트에 안에 'money'가 있으므로 pocket.contains("money")는 참
//else if는 개수에 제한 없이 사용


