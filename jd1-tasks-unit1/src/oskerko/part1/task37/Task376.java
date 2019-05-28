package oskerko.part1.task37;

import oskerko.scans.*;

// • Треугольник со сторонами а,b,с является равнобедренным.

public class Task376 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		
		a = ScanInts.scanInts("a");
		b = ScanInts.scanInts("b");
		c = ScanInts.scanInts("c");
		
		System.out.println((a == b) || (b == c) || (a == c));
		
	}

}
