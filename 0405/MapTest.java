import java.util.*;

public class MapTest {
    public static void main(String[] args) {
    
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        
        // get key에 -> 해당되는 value값을 얻기 위해
        System.out.println(map.get("people"));

        // containsKey -> 맵(Map)에 해당 키(key)가 있는지를 조사하여 그 결과값을 리턴
        System.out.println(map.containsKey("people"));

        // size -> Map의 갯수를 리턴
        System.out.println(map.size());

        

    }
}

//맵(Map)은 사전(dictionary)과 비슷