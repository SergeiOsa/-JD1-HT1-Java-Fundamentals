package oskerko.part6.task34;

import java.util.Random;

import oskerko.scans.ScanInts;

/*34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в
каждом столбце число единиц равно номеру столбца.*/

public class Task34 {

	public static void main(String[] args) {

		int[][] mas;
		int n;
		int m;

		n = ScanInts.scanInts("n");
		m = ScanInts.scanInts("m, m <= n");

		mas = new int[n][m];

		Random rand = new Random();

		int count = 0;
		int a;
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < n; i++) {
				if (count <= j) {
					do {
						a = rand.nextInt(n);
					} while (mas[a][j] == 1);
					mas[a][j] = 1;
					count++;
				}
			}
			count = 0;
		}

		System.out.println("mas: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("%-2d  ", mas[i][j]);
			}
			System.out.println();
		}

	}

}
