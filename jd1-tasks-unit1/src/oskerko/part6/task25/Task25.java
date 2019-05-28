package oskerko.part6.task25;

import oskerko.scans.ScanInts;

public class Task25 {

	public static void main(String[] args) {
		
		int[][] mas;
		int n;
		int number = 1;
		
		n = ScanInts.scanInts("n");

		mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				mas[i][j] = number;
				number++;
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
