package oskerko.part2.task23;

import oskerko.scans.*;

// 23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12).
//      Если введены некорректные данные, то сообщить об этом.

public class Task23 {

	public static void main(String[] args) {

		int m;
		int d = 0; // если не инициализирую, то компилятор говорит, что может не инициализороваться. я не понимаю почему

		do {
			m = ScanInts.scanInts("month");
			if ((m < 1) || (m > 12)) {
				System.out.println("Введите число от 1 до 12");
			}
		} while ((m <= 0) || (m >= 13));


		if ((m == 1) || (m == 3) || (m == 5) || (m == 7) || (m == 8) || (m == 10) || (m == 12)) {
			do {
				d = ScanInts.scanInts("day");
				if ((d < 1) || (d > 31)) {
					System.out.println("Введите число от 1 до 31");
				}
			} while ((d <= 0) || (d >= 32));
		}

		if ((m == 4) || (m == 6) || (m == 9) || (m == 11)) {
			do {
				d = ScanInts.scanInts("day");
				if ((d < 1) || (d > 30)) {
					System.out.println("Введите число от 1 до 30");
				}
			} while ((d <= 0) || (d >= 31));
		}

		if ((m == 2)) {
			do {
				d = ScanInts.scanInts("day");
				if ((d < 1) || (d > 28)) {
					System.out.println("Введите число от 1 до 28");
				}
			} while ((d <= 0) || (d >= 29));
		}

		System.out.printf("%02d.%02d", d, m);

	}

}
