package oskerko.part6.task06;

import java.util.Random;

import oskerko.scans.ScanInts;

/* 6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
больше последнего.*/

public class Task06 {

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
			for (int j = 0; j < m; j = j + 2) {
				if(mas[0][j] > mas[n-1][j]) {
				System.out.printf("%-2d  ", mas[i][j]);
				}
			}
			System.out.println();
		}
		
		
	}

}
