package oskerko.part2.task36;

import oskerko.scans.ScanInts;

// 36. Вычислить значение функции:

public class Task36 {

	public static void main(String[] args) {

		int x;
		double f;

		x = ScanInts.scanInts("x");

		if (x <= 3) {
			f = x * x - 3 * x + 9;
			System.out.println("F(x) = " + f);
		} else {
			f = 1 / (Math.pow(x, 3) + 6);
			System.out.println("F(x) = " + f);
		}

	}

}
