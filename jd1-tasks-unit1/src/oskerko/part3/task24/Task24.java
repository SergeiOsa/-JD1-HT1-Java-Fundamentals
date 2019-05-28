package oskerko.part3.task24;

import oskerko.scans.ScanInts;

/*24. Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
Преобразовать его в другое число, цифры которого будут следовать в обратном порядке по
сравнению с введенным числом.*/

public class Task24 {

	public static void main(String[] args) {

		int a;
		int b;
		int c = 0;
		String str;
		int sum = 0;
		int len;

		a = ScanInts.scanInts("a");

		str = Integer.toString(a);
		len = str.length();

		for (int i = 0; i < len; i++) {
			b = a % 10;
			if (b % 2 == 0) {
				sum = sum + b;
			}
			a = a / 10;
			c = c + b * (int) Math.pow(10, len - 1 - i);
		}

		System.out.println("sum=" + sum);
		System.out.println("c=" + c);

	}

}
