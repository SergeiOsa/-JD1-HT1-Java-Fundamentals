package oskerko.part6.task16;

import oskerko.scans.ScanInts;

public class Task16 {

	public static void main(String[] args) {
		
		int[][] mas;
		int n;

		n = ScanInts.scanInts("n, n - чётное");

		mas = new int[n][n];

		for (int i = 0; i < n; i++) {
			mas[i][i] = (i + 1) * (i + 2); 			
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
