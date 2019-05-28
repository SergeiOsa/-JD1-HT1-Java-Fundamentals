package oskerko.part1.task27;

import oskerko.scans.ScanDoubles;

/* 27. Дано значение a. Не используя никаких функций и никаких операций, кроме умножения,
получить значение а8 за три операции и а10 за четыре операции.*/

public class Task27 {

	public static void main(String[] args) {

		double x;
		double a;
		
		x = ScanDoubles.scanDoubles("a");
		
		a = Math.pow(x, 8);
		
		double x1 = x * x;
		double x2= x1 * x1;
		double x3 = x2 * x2;
		
		System.out.println(a + " (a8 через Math.pow)");
		System.out.println(x3 + " (за 3 дейсвия)");
		
		a = Math.pow(x, 10);
		
		double x4 = x3 * x1;
		
		System.out.println(a + " (a10 через Math.pow)");
		System.out.println(x4 + " (за 4 дейсвия)");
	}

}
