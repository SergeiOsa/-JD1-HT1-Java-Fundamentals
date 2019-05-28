package oskerko.part1.task03;

import oskerko.scans.*;

// 3. Найдите значение функции: z = 2 * x + ( y – 2 ) * 5.

public class Task03 {
	
	public static void main(String[] args) {
		
		double z;
		double x;
		double y;
		
		x = ScanDoubles.scanDoubles("x");
		y = ScanDoubles.scanDoubles("y");
		
		z = 2 * x + ( y - 2 ) * 5;
		System.out.println("z = " + z);
		
	}

}
