import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<String>();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        
        //add -> 해당 인덱스에 해당 항목삽입
        // pitches.add(0, "133");
        
        //get -> 인덱스의 값을 추출
        System.out.println(pitches.get(1));
        
        //contains -> 리스트 안에 항목값이 있는지 boolean으로 리턴
        System.out.println(pitches.contains("142"));
        
        //size -> ArrayList의 갯수를 리턴
        System.out.println(pitches.size());
        
        //remove(객체) ->  객체에 해당되는 항목을 삭제하고 삭제한 결과를 리턴
        System.out.println(pitches.remove("129"));

        //remove(인덱스) -> 인덱스의 항목을 삭제하고 삭제된 항목을 리턴
        System.out.println(pitches.remove(0));

    }
}


//자료형의 갯수가 가변하는 상황이라면 List를 사용하는 것이 유리하다.