package newvariable;

public class Var {

	public static void main(String[] args) {
		var i = 10;                  //int로 컴파일
		var j = 10.0;                //double로 컴파일
		var str = "hello";           //String으로 컴파일
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test"; //같은 문자열끼리는 대입 가능
		//str = 3;      형 변환 불가능
	}

}
