package oskerko.part3.task27;

import oskerko.scans.ScanInts;

// 27. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме
//     единицы и самого числа. m и n вводятся с клавиатуры.

public class Task27 {

	public static void main(String[] args) {

		int m;
		int n;

		m = ScanInts.scanInts("m");
		do {
			n = ScanInts.scanInts("n");
			if (n <= m) {
				System.out.println("n должно быть больше m");
			}
		} while (n <= m);

		for (int i = m; i <= n; i++) {
			System.out.println("Делители " + i + ":");
			for (int j = 2; j < 10; j++) {
				if (i % j == 0) {
					if (i != j) {
						System.out.print(j + ", ");
					}
				}
			}
			System.out.println();
		}
		
	}

}
