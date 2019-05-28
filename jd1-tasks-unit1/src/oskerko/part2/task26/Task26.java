package oskerko.part2.task26;

import oskerko.scans.*;

// 26. Написать программу нахождения суммы большего и меньшего из трех чисел.

public class Task26 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
			
		int sum = 0;
		
		a = ScanInts.scanInts(" a");
		b = ScanInts.scanInts(" b");
		c = ScanInts.scanInts(" c");
		
		if (((a <= b) && (a >= c)) || ((a >= b) && (a <= c))) {
			sum = b + c;
		}
		
		if (((b <= a) && (b >= c)) || ((b >- a) && (b <= c))) {
			sum = a + c;
		}
		
		if (((c <= a) && (c >= b)) || ((c >= a) && (c <= b))) {
			sum = a + b;
		}
		
		System.out.println(sum);
		
	}

}
