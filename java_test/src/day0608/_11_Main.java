package day0608;

import java.util.HashMap;
import java.util.Scanner;

public class _11_Main {

	public static void main(String[] args) {
		
		_10_Person yoon = new _10_Person();
		yoon.setAddr("서울");
		System.out.println(yoon.getAddr());
		
		_10_Person choi = new _10_Person("최인경", 27, "인천");
		System.out.println(choi.getName());
		choi.setName("윤나연");
		System.out.println(choi.getName());

//		Scanner s = new Scanner(System.in);
//		HashMap<String, _10_Person> m = new HashMap<>();
//
//		while (true) {
//			System.out.println("1. 입력, 2. STOP");
//			int a = s.nextInt();
//			if (a == 1) {
//				for (int i = 0; i < 2; i++) {
//					String name = s.next();
//					int age = s.nextInt();
//					String addr = s.next();
//
//					_10_Person p = new _10_Person(name, age, addr);
//
//					m.put(p.getName(), p);
//				}
//			} else break;
//			
//		}
//		
//		System.out.println(m);
	}
}
