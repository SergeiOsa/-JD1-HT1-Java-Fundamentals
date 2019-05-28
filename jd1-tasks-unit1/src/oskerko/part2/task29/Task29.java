package oskerko.part2.task29;

import oskerko.scans.ScanInts;

// 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Task29 {

	public static void main(String[] args) {

		int x1;
		int x2;
		int x3;
		int y1;
		int y2;
		int y3;
		
		x1 = ScanInts.scanInts(" x1");
		y1 = ScanInts.scanInts(" y1");
		x2 = ScanInts.scanInts(" x2");
		y2 = ScanInts.scanInts(" y2");
		x3 = ScanInts.scanInts(" x3");
		y3 = ScanInts.scanInts(" y3");
	
		System.out.println((x3 - x1)/(x2-x1) == (y3 - y1)/(y2-y1));
		
	}
	
}
