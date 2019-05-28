package oskerko.part6.task24;

import java.util.Random;

import oskerko.scans.ScanInts;

public class Task24 {

	public static void main(String[] args) {
		
		int[] mas;
		int[][] matrix;
		int n;
		
		n = ScanInts.scanInts("n");
		mas = new int[n];
		matrix = new int[n][n];
		
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
		}
		
		System.out.print("mas: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
		
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				matrix[i][j] = (int) Math.pow(mas[j], i + 1);
			}
		}
		
		System.out.println("matrix: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%-8d", matrix[i][j]);
			}
			System.out.println();
		}
		
	}

}
