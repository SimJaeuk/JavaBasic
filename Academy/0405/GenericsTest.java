import java.util.ArrayList;

public class GenericsTest { 
    public static void main(String[] args) {
ArrayList<String> aList = new ArrayList<String>();
aList.add("hello");
aList.add("java");

String hello = aList.get(0);
String java = aList.get(1);
    
    }
}


// 제네릭스를 사용하지 않을 경우 ArrayList 안에 추가되는 객체는 Object 자료형으로 인식된다.
// 값을 가져올 경우에는 항상 Object 자료형에서 String 자료형으로 다음과 같이 형변환(casting)을 해 주어야만 한다.
// 제네릭스로 자료형을 선언하기만 하면 그 이후로는 자료형에 대한 형변환 과정이 필요없다.

// ArrayList를 이용할때 Generics를 사용하자!