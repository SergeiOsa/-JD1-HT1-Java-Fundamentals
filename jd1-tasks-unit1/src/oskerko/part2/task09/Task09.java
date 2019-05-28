package oskerko.part2.task09;

import oskerko.scans.ScanInts;

// 9. Составить программу, которая определит по трем введенным сторонам,
// является ли данный треугольник равносторонним.

public class Task09 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
			
		a = ScanInts.scanInts(" a");
		b = ScanInts.scanInts(" b");
		c = ScanInts.scanInts(" c");
		
		if((a == b) && (a == c) && (b == c)) {
			System.out.println("Равносторонний");
		} else {
			System.out.println("нет");
		}
		
	}

}
