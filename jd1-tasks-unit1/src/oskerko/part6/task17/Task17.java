package oskerko.part6.task17;

import oskerko.scans.ScanInts;

public class Task17 {

	public static void main(String[] args) {
		
		int[][] mas;
		int n;

		n = ScanInts.scanInts("n, n - чётное");

		mas = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == 0 || j == 0 || i == (n - 1) || j == (n - 1)) {
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
