package day13;

class Singleton04 {
	private static Singleton04 si = new Singleton04();
	private Singleton04() {
		System.out.println("기본 생성자 실행");
	}
	public static Singleton04 getInstance() {
		System.out.println("si : " + si);
		return si;
	}
}

public class Ex04_Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton04 si = Singleton04.getInstance();
		System.out.println("si : " + si);
	}

}
