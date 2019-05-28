package oskerko.part7.task01;

import oskerko.scans.ScanInts;

/*1. Треугольник задан координатами своих вершин. Написать метод для вычисления его
площади.*/

public class Task01 {

	public static void main(String[] args) {
		
		double s;
		
		s = square();
		
		System.out.println(s + " кв. ед");
	}

	public static double square() {
		
		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;

		double s;
		
		x1 = ScanInts.scanInts("x1");
		y1 = ScanInts.scanInts("y1");
		x2 = ScanInts.scanInts("x2");
		y2 = ScanInts.scanInts("y2");
		x3 = ScanInts.scanInts("x3");
		y3 = ScanInts.scanInts("y3");
		
		s = ((((double) x1 - x3) * (y2 - y1)) - ((x2 - x3) * (y1 - y3))) / 2;
		s = Math.abs(s);
		
		return s;
	}
	
}
