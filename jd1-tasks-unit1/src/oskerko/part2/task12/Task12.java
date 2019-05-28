package oskerko.part2.task12;

import oskerko.scans.ScanInts;

// 12. Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, 
// и в четвертую степень — отрицательные.

public class Task12 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
			
		a = ScanInts.scanInts(" a");
		b = ScanInts.scanInts(" b");
		c = ScanInts.scanInts(" c");
		
		if (a >= 0) {
			a = a * a;
			System.out.println("a^2=" + a);
		} else {
			a = (int)(Math.pow(a, 4));
			System.out.println("a^4=" + a);
		}
		
		if (b >= 0) {
			b = b * b;
			System.out.println("b^2=" + b);
		} else {
			b = (int)(Math.pow(b, 4));
			System.out.println("b^4=" + b);
		}
		
		if (c >= 0) {
			c = c * c;
			System.out.println("c^2=" + c);
		} else {
			c = (int)(Math.pow(c, 4));
			System.out.println("c^4=" + c);
		}
		
	}

}
