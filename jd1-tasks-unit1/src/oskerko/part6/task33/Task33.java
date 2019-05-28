package oskerko.part6.task33;

import java.util.Arrays;
import java.util.Random;
import oskerko.scans.ScanInts;


// 33. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class Task33 {

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
		
		
		int[] mas2 = new int[n];
		for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					mas2[j] = mas[j][i];
				}
				Arrays.sort(mas2);
				for (int j = 0; j < n; j++) {
					mas[j][i] = mas2[j];
				}
			}
		System.out.println("mas (столбец возрастание): ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("%-2d  ", mas[i][j]);
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mas2[j] = mas[j][i];
			}
			Arrays.sort(mas2);
			for (int j = 0; j < n; j++) {
				mas[j][i] = mas2[n - j - 1];
			}
		}
		System.out.println("mas (столбец убывание): ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("%-2d  ", mas[i][j]);
			}
			System.out.println();
		}
		
	}

}
