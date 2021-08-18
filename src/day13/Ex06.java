package day13;


class AAA {
	public void aaa() {
		System.out.println("test");
	}
}

class Calc06 extends AAA{
	public int n = 12345;
	private String ss = "private 변수";
	public Calc06(String s) {
		System.out.println(s + " 부모 생성자");
	}
	public void test() {
		System.out.println("부모 테스트 실행");
	}
}

class Computer06 extends Calc06 {
	public int n = 7777;
	public Computer06(String ss) {
		super(ss);
		System.out.println(ss + " 자식 생성자");
		super.test();
		System.out.println("n : " + n);
		System.out.println("super.n : " + super.n);
	}
	public void test() {
		System.out.println("자식 test 실행");
	}
}

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer06 com = new Computer06("전달");
		com.aaa();
	}

}
