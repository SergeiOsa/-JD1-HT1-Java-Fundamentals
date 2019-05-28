package oskerko.part1.task11;

import oskerko.scans.*;

// 11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.

public class Task11 {

	public static void main(String[] args) {

		double a;
		double b;
		double n;
		double z;
		
		
		a = ScanDoubles.scanDoubles("a");
		b = ScanDoubles.scanDoubles("b");
		
		z = ( a * b ) / 2;
		n = a + b + Math.hypot(a, b);
		
		System.out.println("Периметр равен " + n + " ед.");
		System.out.println("Площадь равна " + z + " кв. ед.");
	
	}

}
