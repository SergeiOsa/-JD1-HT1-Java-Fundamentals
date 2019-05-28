package oskerko.part2.task13;

import oskerko.scans.ScanInts;

// 13. Даны две точки А(х1, у1) и В(х2, у2).
// Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.

public class Task13 {

	public static void main(String[] args) {
		
		int x1;
		int x2;
		int y1;
		int y2;
		
		double z1;
		double z2;
			
		System.out.println("Введите координаты 1ой точки");
		x1 = ScanInts.scanInts(" x1");
		y1 = ScanInts.scanInts(" y1");
		
		System.out.println("Введите координаты 1ой точки");
		x2 = ScanInts.scanInts(" x2");
		y2 = ScanInts.scanInts(" y2");

		z1 = Math.sqrt((x1*x1+y1*y1));
		z2 = Math.sqrt((x2*x2+y2*y2));

		if(z1 <= z2) {
			if(z1 == z2) {
				System.out.println("равноудалены");
			} else {
				System.out.println("первая точка ближе");
			}
		} else {
			System.out.println("вторая точка ближе");
		}
				
	}
	
}
