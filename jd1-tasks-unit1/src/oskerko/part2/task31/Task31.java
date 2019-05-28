package oskerko.part2.task31;

import oskerko.scans.ScanInts;

// 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
// Определить, пройдет ли кирпич через отверстие.

public class Task31 {

	public static void main(String[] args) {

		int a;
		int b;
		int x;
		int y;
		int z;
		
		a = ScanInts.scanInts(" A");
		b = ScanInts.scanInts(" B");
		x = ScanInts.scanInts(" x");
		y = ScanInts.scanInts(" y");
		z = ScanInts.scanInts(" z");
		
		// xy xz yz
		
		if(((x <= a) && (y <= b) || (y <= a) && (x <= b)) 
				|| ((x <= a) && (z <= b) || (z <= a) && (x <= b))
				|| ((y <= a) && (z <= b) || (z <= a) && (y <= b)))
		{
			System.out.println("Пройдёт");
		} else {
			System.out.println("Нет");
		}
		
	}

}
