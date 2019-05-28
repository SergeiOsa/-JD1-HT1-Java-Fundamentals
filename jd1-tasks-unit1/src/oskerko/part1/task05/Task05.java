package oskerko.part1.task05;

import oskerko.scans.*;

// 5. Составить алгоритм нахождения среднего арифметического двух чисел

public class Task05 {

	public static void main(String[] args) {
		
		double z;
		double a;
		double b;
		
		a = ScanDoubles.scanDoubles("a");
		b = ScanDoubles.scanDoubles("b");
		
		
		z = (a + b) / 2;
		
		System.out.println("Cреднее арифметическое двух чисел: z = " + z);	
		
     }

}