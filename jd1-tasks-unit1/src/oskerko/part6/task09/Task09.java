package oskerko.part6.task09;

import java.util.Random;

import oskerko.scans.ScanInts;

// 9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task09 {

	public static void main(String[] args) {
		
		int[][] mas;
		int n;
		
		n = ScanInts.scanInts("n");
		
		mas = new int[n][n];
		
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}
		System.out.println("mas: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%-2d  ", mas[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("mas: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%-2d  ", mas[i][i]);
		}
		
	}

}
