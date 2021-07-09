// 3, 4, 5월 봄
// 6, 7, 8월 여름
// 9, 10, 11월 가을
// 12, 1, 2월 겨울

public class Quiz { 
    public static void main(String[] args) {
        int month = 8;
        String monthString = "";
        switch (month) {
            case 12:    
            case 1:             
            case 2: monthString = "겨울";
                    break;
            case 3:
            case 4:          
            case 5: monthString = "봄";
                    break;
            case 6: 
            case 7: 
            case 8: monthString = "여름";
                    break;
            case 9:
            case 10:
            case 11: monthString = "가을";
                    break;
            default: monthString = "Invalid month";
                    break;
        }
        System.out.println(monthString);
    }
}

// switch/case문은 if else 구조로 변경이 가능
// if else 구조로 작성된 모든 코드를 switch 문으로 변경하는건 불가