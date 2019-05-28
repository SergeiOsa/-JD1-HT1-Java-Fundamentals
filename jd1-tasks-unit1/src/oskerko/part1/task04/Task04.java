package oskerko.part1.task04;

import oskerko.scans.*;

// 4. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

public class Task04 {
	
	public static void main(String[] args) {
		
		double z;
		double a;
		double b;
		double c;
		
		a = ScanDoubles.scanDoubles("a");
		b = ScanDoubles.scanDoubles("b");
		c = ScanDoubles.scanDoubles("c");
		
		z = ( ( a - 3 ) * b / 2 ) + c;
		
		System.out.println("z = " + z);
		
	}

}
