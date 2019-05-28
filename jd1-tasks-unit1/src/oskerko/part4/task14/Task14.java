package oskerko.part4.task14;

import java.util.Random;

import oskerko.scans.ScanInts;

// 14. Дан одномерный массив A[N]. Найти: max( a2, a4, a2n, ) min( a1, a3, a2k+1, )

public class Task14 {

	public static void main(String[] args) {
		
		int n;
		int[] mas;
		int min = 2147483647;
		int max = 0;
		int sum;
		
		n = ScanInts.scanInts("количество натур чисел");
		
		Random rand = new Random();
		
		mas = new int[n];
		
		for (int i = 0; i < n; i++) {
			mas[i] = rand.nextInt(100);
		}
		
		System.out.print("mas: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
		
		for (int i = 1; i < mas.length; i = i + 2) {
			if(mas[i] > max) {
				max = mas[i];
			}
		}
		
		for (int i = 0; i < mas.length; i = i + 2) {
			if(mas[i] < min) {
				min = mas[i];
			}
		}
		
		sum = min + max;
		
		System.out.println("sum=" + sum);
		
	}

}
