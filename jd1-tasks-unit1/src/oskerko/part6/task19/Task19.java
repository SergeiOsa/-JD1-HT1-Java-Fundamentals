package oskerko.part6.task19;

import oskerko.scans.ScanInts;

public class Task19 {

	public static void main(String[] args) {
		
		int[][] mas;
		int n;

		n = ScanInts.scanInts("n, n - чётное");

		mas = new int[n][n];

		int m;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i <= j && (n - i) > j ) {
				mas[i][j] = 1;
				}
			
			}
			for (int j = 0; j < n; j++) {
				if(i>=j && (n-i-1) <= j) {
					mas[i][j] = 1;
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
