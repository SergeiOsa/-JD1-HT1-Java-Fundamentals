package oskerko.part1.task07;

import oskerko.scans.*;

// 7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника

public class Task07 {
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double z;
		
		System.out.println("Введите значение ширины а прямоугольника");
		
		a = ScanDoubles.scanDoubles("a");
		
		b = 2 * a;
		
		z = a * b;
		
		System.out.println("Площадь прямоугольника " + z + " кв. ед.");
	}

}
