package oskerko.part6.task11;

import java.util.Random;

import oskerko.scans.ScanInts;

/*11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая
строка справа налево, вторая строка слева направо, третья строка справа налево и так
далее.*/

public class Task11 {

	public static void main(String[] args) {

		int[][] mas;
		int n;
		int m;

		n = ScanInts.scanInts("n");
		m = ScanInts.scanInts("m");

		mas = new int[n][m];

		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}
		System.out.println("mas: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("%-2d  ", mas[i][j]);
			}
			System.out.println();
		}

		System.out.println("mas: ");
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = m - 1; j > -1; j--) {
					System.out.printf("%-2d  ", mas[i][j]);
				}
			} else {
				for (int j = 0; j < m; j++) {
					System.out.printf("%-2d  ", mas[i][j]);
				}
			}

			System.out.println();
		}

	}

}
