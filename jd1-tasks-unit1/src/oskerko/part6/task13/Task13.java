package oskerko.part6.task13;

import java.util.Random;

import oskerko.scans.ScanInts;

// 13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task13 {

	public static void main(String[] args) {

		int[][] mas;
		int n;

		n = ScanInts.scanInts("n, n - чётное");

		mas = new int[n][n];

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					mas[i][j] = j + 1;
				}
			} else {
				for (int j = 0; j < n; j++) {
					mas[i][j] = n - j;
				}
			}
		}
		
		
		System.out.println("mas: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%-2d  ", mas[i][j]);
			}
			System.out.println();
		}
	}

}
