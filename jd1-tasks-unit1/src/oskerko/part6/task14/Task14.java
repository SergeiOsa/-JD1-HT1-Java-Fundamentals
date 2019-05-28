package oskerko.part6.task14;

import oskerko.scans.ScanInts;

public class Task14 {

	public static void main(String[] args) {
		
		int[][] mas;
		int n;

		n = ScanInts.scanInts("n, n - чётное");

		mas = new int[n][n];

		for (int i = 0; i < n; i++) {
			mas[i][n - i - 1] = i + 1; 			
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
