package oskerko.part6.task03;

import java.util.Random;

import oskerko.scans.ScanInts;

// 3. Дана матрица. Вывести на экран первый и последний столбцы.

public class Task03 {

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
			for (int j = 0; j < m; j++) {
				if(j > 0 && j < (m - 1)) {
					System.out.printf("%-2c  ", ' ');
				} else {
				System.out.printf("%-2d  ", mas[i][j]);
				}
			}
			System.out.println();
		}
			System.out.println();
		
	}

}
