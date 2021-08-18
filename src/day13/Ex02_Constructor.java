package day13;

import java.util.Scanner;

class Constructor02 {
	private int age;
	public Constructor02(int age) {
		this.age = age - 1;
	}
	public int getAge() {
		return age;
	}
}

public class Ex02_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이 입력");
		int age = scanner.nextInt();
		Constructor02 con = new Constructor02(age);
		System.out.println("만 나이 : " + con.getAge());
		//테스트
	}

}
