package day13;

class Constructor01 {
	public Constructor01(String s) {
		System.out.println(s + " 생성자 실행");
	}
	public Constructor01() {
		System.out.println("디폴트 생성자 실행");
	}
	public void test(String s) {
		System.out.println(s + " test 실행");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		/*
		 생성자
		 - 보통 초기화를 하고자 할때 사용한다.
		 - 객체가 생성될때 자동으로 호출된다.
		 - 클래스 이름과 동일하게 만든다.
		 - 반환타입은 없어야 된다.
		 */
		Constructor01 ex = new Constructor01();
		ex.test("테스트");
	}
}
