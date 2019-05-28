package oskerko.part6.task18;

import oskerko.scans.ScanInts;

public class Task18 {

	public static void main(String[] args) {
		
		int[][] mas;
		int n;

		n = ScanInts.scanInts("n, n - чётное");

		mas = new int[n][n];

		int m = n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mas[i][j] = i + 1;
			}
			m--;
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
