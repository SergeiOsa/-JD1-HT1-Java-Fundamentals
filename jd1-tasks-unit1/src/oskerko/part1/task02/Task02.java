package oskerko.part1.task02;

import oskerko.scans.*;

//2. Найдите значение функции: с = 3 + а.

public class Task02 {
	
	public static void main(String[] args) {
		
		double c;
		double a = ScanDoubles.scanDoubles("a");
		c = 3 + a;
		System.out.println("c = " + c);
	}

}
