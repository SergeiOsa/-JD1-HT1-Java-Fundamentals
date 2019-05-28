package oskerko.part2.task18;

import oskerko.scans.ScanInts;

// 18. Подсчитать количество отрицательных среди чисел а, b, с.

public class Task18 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		int count = 0;
			
		a = ScanInts.scanInts(" a");
		b = ScanInts.scanInts(" b");
		c = ScanInts.scanInts(" c");
		
		int[] mas = {a, b, c};
		
		for(int i = 0; i < 3; i++) {
			if ( mas[i] < 0) {
				count++;
			}
		}
		
		System.out.println("Кол-во отриц = " + count);
		
	}
}
