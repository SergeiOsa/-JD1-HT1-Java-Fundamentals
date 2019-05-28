package oskerko.part6.task23;

import oskerko.scans.ScanInts;

public class Task23 {

	public static void main(String[] args) {
		
		double[][] mas;
		int n;
		int count = 0;

		n = ScanInts.scanInts("n, n - чётное");

		mas = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mas[i][j] = Math.sin((i * i - j * j) / n );
				if(mas[i][j] > 0) {
					count++;
				}
				
			}
		}
		
		
		System.out.println("mas: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("% -8.3f", mas[i][j]);
			}
			System.out.println();
		}

		System.out.println("кол0во полож эл-ов: " + count);
		
	}

}
