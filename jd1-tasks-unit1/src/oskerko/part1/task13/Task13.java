package oskerko.part1.task13;

import oskerko.scans.*;

//13. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.



public class Task13 {

	public static void main(String[] args) {

		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;
		double z;
		double p;
		
		x1 = ScanDoubles.scanDoubles("x1");
		y1 = ScanDoubles.scanDoubles("y1");
		x2 = ScanDoubles.scanDoubles("x2");
		y2 = ScanDoubles.scanDoubles("y2");
		x3 = ScanDoubles.scanDoubles("x3");
		y3 = ScanDoubles.scanDoubles("y3");
		
		double n11 = x1 - x3;
		double n12 = y1 - y3;
		double n21 = x2 - x3;
		double n22 = y2 - y3;
		
		double n = ( n11 * n22 ) - ( n12 * n21 );
		z = Math.abs(n) / 2;
		
		
		double a1 = x2 - x1;
		double a2 = y2 - y1;
		
		double b1 = x3 - x2;
		double b2 = y3 - y2;
		
		double c1 = x3 - x1;
		double c2 = y3 - y1;
		
		p = Math.hypot(a1, a2) + Math.hypot(b1, b2) + Math.hypot(c1, c2);
		
		System.out.println("Площадь треугольника равна " + z + " кв. ед.");
		System.out.println("Периметр треугольника равен " + p + " кв.ед.");
		
	}

}
