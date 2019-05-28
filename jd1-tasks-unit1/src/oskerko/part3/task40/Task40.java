package oskerko.part3.task40;

import oskerko.scans.ScanInts;

// 40. Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры.

public class Task40 {

	public static void main(String[] args) {

		int n;

		String str;
		int l; // для длины числа

		int a; // переменная для записи i;
		int[] mas; // для записи цифр числа

		int count = 0; // счётчик для сравнения длины числа и количества остатков отделения с 0

		n = ScanInts.scanInts("N");

		for (int i = 1; i <= n; i++) {
			a = i;
			str = Integer.toString(a);
			l = str.length();
			mas = new int[l];

			for (int j = 0; j < l; j++) {
				mas[j] = a % (int) Math.pow(10, j + 1);
				a = a / 10;
			}
			a = i;

			for (int j = 0; j < l; j++) {
				if (mas[j] == 0) {
					continue;
				}
				if (a % mas[j] == 0) {
					count++;
				}
			}

			if (count == l) {
				System.out.println(a);
			}

			count = 0;
		}

		System.out.println("exit");

	}

}
