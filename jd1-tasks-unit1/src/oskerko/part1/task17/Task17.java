package oskerko.part1.task17;

import oskerko.scans.*;

//17. Даны два числа. Найти среднее арифметическое кубов этих чисел и 
//     среднее геометрическое модулей этих чисел

public class Task17 {
	
	public static void main(String[] args) {
		
		int x;
		int y;
		double a;
		double b;
		
		x = ScanInts.scanInts("x");
		y = ScanInts.scanInts("y");
		
		a = (Math.pow(x, 3) + Math.pow(y, 3)) / 2;
		System.out.println("Cреднее арифметическое кубов этих чисел: " + a);
		
		b = Math.sqrt(Math.abs(x)*Math.abs(y));
		System.out.println("Cреднее геометрическое модулей этих чисел: " + b);
	}

}
