package oskerko.part3.task25;

import oskerko.scans.ScanInts;

// 25. Требуется определить факториал числа, которое ввел пользователь.

public class Task25 {

	public static void main(String[] args) {
		
		int a;
		int f = 1;
		
		a = ScanInts.scanInts("a");
		
		for (int i = 2; i <= a; i++) {
			f = f * i;
		}
		
		System.out.println("f=" + f);
		
	}

}
