package oskerko.part1.task12;

import oskerko.scans.*;

//12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).

public class Task12 {

	public static void main(String[] args) {
		
		double x1;
		double x2;
		double y1;
		double y2;
		double x;
		double y;
		double z;
		
		x1 = ScanDoubles.scanDoubles("x1");
		y1 = ScanDoubles.scanDoubles("y1");
		x2 = ScanDoubles.scanDoubles("x2");
		y2 = ScanDoubles.scanDoubles("y2");
		
		x = x2 - x1;
		y = y2 - y1;
		z = Math.hypot(x, y);
		
		System.out.println("Расстояние между двумя точками " + z + " ед.");
		
	}

}
