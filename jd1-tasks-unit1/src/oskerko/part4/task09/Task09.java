package oskerko.part4.task09;

import java.util.Random;

import oskerko.scans.ScanInts;

// 9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший
//    элементы.

public class Task09 {

	public static void main(String[] args) {
		
		int n;
		int[] mas;
		int min = 2147483647;
		int max = 0;
		int nMin = 0;
		int nMax = 0;
		
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
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < min) {
				min = mas[i];
			}
			if (mas[i] > max) {
				max = mas[i];
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			if(min == mas[i]) {
				nMin = i;
			}
			if(max == mas[i]) {
				nMax = i;
			}
				
		}
		mas[nMin] = max;
		mas[nMax] = min;
		
		System.out.print("mas: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
		
	}

}
