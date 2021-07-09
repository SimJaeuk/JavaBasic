import java.util.ArrayList;
public class Foreach {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");

        for(String number: numbers) {
            System.out.println(number);
        }
    }
}

// foreach문은 따로 반복회수를 명시적으로 주는 것이 불가능
// 1스탭씩 순차적으로 반복될때만 사용가능
