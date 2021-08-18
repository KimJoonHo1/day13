package day13;

import java.util.Calendar;

class Singleton01 {
	public int num;
}

public class Ex03_Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton01 si = new Singleton01();
		Singleton01 si02 = new Singleton01();
		si.num = 12345;
		si02.num = 4444;
		
		System.out.println("si.num : " + si.num);
		System.out.println("si02.num : " + si02.num);
		
		System.out.println("si : " + si);
		System.out.println("si02 : " + si02);
	}

}
