package oskerko.part2.task32;

import oskerko.scans.ScanInts;

// 32. Написать программу, которая по заданным трем числам определяет, 
// является ли сумма каких-либо двух из них положительной.

public class Task32 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;

		a = ScanInts.scanInts(" a");
		b = ScanInts.scanInts(" b");
		c = ScanInts.scanInts(" c");

		if(((a + b) >= 0) || ((a + c) >= 0) || ((b + c) >= 0)){
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
	}
}
