package oskerko.part6.task10;

import java.util.Random;

import oskerko.scans.ScanInts;

// 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task10 {

	public static void main(String[] args) {
		
		int[][] mas;
		int n;
		int m;
		int k;
		int p;
		
		n = ScanInts.scanInts("n");
		m = ScanInts.scanInts("m");
		
		k = ScanInts.scanInts("k. k>n");
		p = ScanInts.scanInts("p. p>m ");
		
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
		
		System.out.println("line: ");
		for (int i = 0; i < m; i++) {
			System.out.printf("%-2d  ", mas[k-1][i]);
		}
		System.out.println();
		
		System.out.println("column: ");
		for (int i = 0; i < m; i++) {
			System.out.printf("%-2d  ", mas[i][p-1]);
		}
		
	}

}
