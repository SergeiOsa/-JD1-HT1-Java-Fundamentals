package oskerko.part6.task26;

import java.util.Random;

import oskerko.scans.ScanInts;

/*26. С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с
массивом следующие действия:
а) вычислить сумму отрицательных элементов в каждой строке;
б) определить максимальный элемент в каждой строке;
в) переставить местами максимальный и минимальный элементы матрицы.*/

public class Task26 {

	public static void main(String[] args) {
		
		int[][] mas;
		int n;
		int m;
		
		int sum = 0;
		int max = -100;
		int min = 100;
		
		n = ScanInts.scanInts("n");
		m = ScanInts.scanInts("m");

		mas = new int[n][m];

		Random r = new Random();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mas[i][j] = r.nextInt(200) - 100;
			}
		}
		
		System.out.println("mas: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("% -5d", mas[i][j]);
			}
			System.out.println();
		}
		

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(mas[i][j] < 0) {
					sum = sum + mas[i][j];
				}
				if(mas[i][j] > max) {
					max = mas[i][j];
				}
			}
			System.out.print("sum (-) line #" + i + ": " + sum + ";  ");
			System.out.println("max of line #" + i + ": " + max);
			sum = 0;
			max = -100;
		}

		
		int nMinI = 0;
		int nMinJ = 0;
		int nMaxI = 0;
		int nMaxJ = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(mas[i][j] < min) {
					min = mas[i][j];
					nMinI = i;
					nMinJ = j;
				}
				if(mas[i][j] > max) {
					max = mas[i][j];
					nMaxI = i;
					nMaxJ = j;
				}
			}
		}
		mas[nMinI][nMinJ] = max;
		mas[nMaxI][nMaxJ] = min;
		System.out.println("max=" + max + "; min=" + min);
		
		
		System.out.println("mas: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("% -5d", mas[i][j]);
			}
			System.out.println();
		}
		
	}

}
