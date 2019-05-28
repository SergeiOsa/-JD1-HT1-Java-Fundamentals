package oskerko.part6.task38;

import java.util.Random;

import oskerko.scans.ScanInts;

// 38. Найдите сумму двух матриц

public class Task38 {

	public static void main(String[] args) {

		int[][] mas;
		int[][] mas2;
		int[][] masSum;
		int n;
		int m;

		n = ScanInts.scanInts("n");
		m = ScanInts.scanInts("m");

		mas = new int[n][m];
		mas2 = new int[n][m];
		masSum = new int[n][m];

		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mas[i][j] = rand.nextInt(10);
				mas2[i][j] = rand.nextInt(10);
			}
		}

		System.out.println("mas: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("%-2d  ", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println("mas2: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("%-2d  ", mas2[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < masSum.length; i++) {
			for (int j = 0; j < masSum.length; j++) {
				masSum[i][j] = mas[i][j] + mas2[i][j];
			}
		}

		System.out.println("masSum: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("%-2d  ", masSum[i][j]);
			}
			System.out.println();
		}

	}

}
