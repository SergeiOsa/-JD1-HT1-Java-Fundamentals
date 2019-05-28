package oskerko.part7.task05;

import oskerko.scans.ScanInts;

// 5. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.

public class Task05 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		int sum;
		
		a = ScanInts.scanInts("a");
		b = ScanInts.scanInts("b");
		c = ScanInts.scanInts("c");
		
		sum = sum(a, b, c);
		
		System.out.println("sum=" + sum);
	}

	public static int sum(int a, int b, int c) {
		
		int sum;
		
		int min = 2147483647;
		int max = -2147483648;
		
		if(a < min) {
			min = a;
		}
		if(b < min ) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		if(a > max) {
			max = a;
		}
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		
		sum = min + max;
		
		return sum;
	}
}
