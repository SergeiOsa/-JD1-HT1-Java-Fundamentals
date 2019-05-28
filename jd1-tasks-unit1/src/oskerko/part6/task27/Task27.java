package oskerko.part6.task27;

import java.util.Random;

import oskerko.scans.ScanInts;

/*27. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы
одного столбца поставить на соответствующие им позиции другого, а его элементы второго
переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
*/

public class Task27 {

	public static void main(String[] args) {
		
		int[][] mas;
		int n;
		int m;
		int a;
		int b;
		
		n = ScanInts.scanInts("n");
		m = ScanInts.scanInts("m");

		a = ScanInts.scanInts("a, a < m") - 1;
		b = ScanInts.scanInts("b, a < b < m") - 1;
		
		mas = new int[n][m];

		Random r = new Random();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mas[i][j] = r.nextInt(100);
			}
		}
		
		System.out.println("mas: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("% -5d", mas[i][j]);
			}
			System.out.println();
		}
		
		int a2 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (j == a) {
					a2 = mas[i][j];
					
				}
				if (j == b) {
					mas[i][a] = mas[i][j];
					mas[i][j] = a2;
				}
			}
		}
		
		System.out.println("mas: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("% -5d", mas[i][j]);
			}
			System.out.println();
		}
	}

}
