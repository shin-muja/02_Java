package edu.kh.variable.ex1;

public class VariableExample2 {
	public static void main(String[] args) {
		/* 자바 기본 자료형 8가지
		 * 
		 *  논리형 : boolean(1Byte)
		 *  정수형 : Byte(1Byte), short(2Byte), int(4Byte), long(8Byte)
		 *  문자형 : char(2Btye, 유니코드)
		 *  실수형 : float(4Byte), double(8Byte)
		 *  
		 *  기본 아님
		 *  참조형 - 문자열 String : 저장제한이 정해져 있지 않음
		 */
		
		// 변수 선언 : 메모리에 값을 저장할 공간을 할당하는 것
		// 변수 값 대임 : 변수에 값을 집어 넣는 것
		
		boolean booleanData;
		// 메모리에 논리값(t/f)을 저장할 공간을 1btye 할당하고
		// 할당된 공간을 booleanData라고 부르겠다.
		
		booleanData = true; // booleanData 변수에 true 논리값 집어넣기(대입)
		
		System.out.println("booleanData : " + booleanData);
		
		booleanData = false;
		
		System.out.println("booleanData : " + booleanData);
		
		byte btyeNumber = 127; // -128 ~ 128
		// 메모리에 정수값을 저장할 공간을 1btye 할당하고
		// 할당된 공간을 byteNumber라고 부르겠다
		// 선언된 byteNumber 변수에 처음으로 127을 넣음
		// -> 초기화 : 처음 변수에 값을 대입
		
		short shortNumber = 32767; // -32768 ~ 32767
		
		// 정수 자료형 기본형 ( short, byte 는 옛날코드 잔재)
		int intNumber = 2147483647; // -2147483648 ~ 2147483647
	// 자료형 변수명 =  리터럴;
		// 프로그래밍에서 대입되는 이 데이터(값자체)를 리터럴 이라는 단어로도 표현
		
		// ** 리터럴 : 변수에 대입되거나 작성되어지는 값 자체
		// + 자료형에 따라 러터럴 표기법이 다름.
		
		long longNumber = 10000000000L; // L 또는 l
		// The literal 10000000000 of type int is out of range
		// -> 100이라는 값은 int의 범위를 벗어났다
		// 뒤에 L을 붙여줌으로써 long 자료형인것을 나타냄
		
		float floatNumber = 1.2345f; // F 또는 f
		// 1.2345꺼자먼 쓰면 double 자료형으로 인식함
		// 뒤에 f를 붙여줌으로써 float 자료형인것을 나타냄
		
		double doubleNumber = 3.141592;
		// double이 실수형 중에서 기본형!
		// 리터럴 표기버 없는 실수는 double로 인식
		// d를 뒤에 쓸 수는 있다 -> 3.141592d;
		
		// 문자형 리터럴 표기법 : '' ( 홑따옴표 )
		// -> 문자 딱 하나
		char ch = 'A';
		char ch2 = 66;
		
		/* char 자료형에 숫자가 대입될 수 있는 이유
		 *  - 컴퓨터에는 문자표가 존재하고 있음
		 *    숫자에 따라 지정된 문자 모양이 매핑되고
		 *    'B' 문자 그대로 대입되면 변수에 숫자 66으로 변환되어 저장
		 *  -> 반대로 생각하면 변수에 애초에 66이라는 숫자를
		 *    저장하는것이 가능함 
		 */
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);
		
		// 변수 명명 규칙
		
		// 1. 대소문자 구분, 길이제한 x
		int abcdefg123456789;
		int abcdefG123456789; // G 다름
		
		// 2. 예약어 사용 X
		//double final;
		
		// 3. 숫자로 시작 X
		//char 1abc;
		char a1bc;
		
		//4. 특수문자 $, _ 만 사용 가능( 하지만 쓰지 않는다 )
		int $intNumber; // 문제는 없지만 개발자가 직접 이렇게 작성 안함
		int int_Number; // 자바는 카멜 표기법 사용
						// _ 작성 표기법은 DB에서 사용
						// MEMBER_NAME
		
		// 5. 카멜표기법( 맨 처음 소문자 시작, 후 속 단어 첫글자 대문자)
		char helloWorldAppleBananaTomato;
		
		// 6. 변수명은 언어를 가리지 않음(하지만 쓰지 않음)
		int 정수1번;
		double 실수2번 = 3.14;
		System.out.println(실수2번);
		
		// ------------------------------------------------------------
		
		final double PI_VALUE = 3.14;
		
		//PI_VALUE = 3; // 에러, 재대입 불가
		/*  상수 (항상 같은 수)
		 * 	- 변수 한 종류
		 *  - 한번 값이 대입되면 다른 값을 대재입 할수 없음
		 *  - 자료형 앞에 final 키워드를 작성
		 *  
		 *  - 상수 명명 규칙 : 모두 대문자, 여러단어 작성 시 '_' 사용
		 *  
		 *  - 상수를 사용하는 경우
		 *  1) 변하면 안 되는 고정된 값을 저장할 때
		 *  2) 특정한 값에 의미를 부여하는 경우
		 */
		
		final int LEFT_MOVE = -1;
		final int RIGHT_MOVE = 1;
	}
}





































