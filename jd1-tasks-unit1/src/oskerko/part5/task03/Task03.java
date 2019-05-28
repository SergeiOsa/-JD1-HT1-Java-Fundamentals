package oskerko.part5.task03;

import java.util.Arrays;
import java.util.Random;

import oskerko.scans.ScanInts;

/*3. Сортировка выбором. Дана последовательность чисел a1<=a2<= ...<=an .Требуется
переставить элементы так, чтобы они были расположены по убыванию. Для этого в массиве,
начиная с первого, выбирается наибольший элемент и ставится на первое место, а первый
- на место наибольшего. Затем, начиная со второго, эта процедура повторяется. Написать
алгоритм сортировки выбором.*/

public class Task03 {

	public static void main(String[] args) {
		
		int n;
		int[] mas;
		int max = 0;
		
		n = ScanInts.scanInts("количество натур чисел");		
		mas = new int[n];
		
		
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			mas[i] = rand.nextInt(100);
		}
		Arrays.sort(mas);
		System.out.print("mas: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
		
		int nMax = 0;
		for (int i = 0; i < mas.length/2; i++) {
			max = mas[i];
			for (int j = i; j < mas.length; j++) {
				if (max < mas[j]) {
					max = mas[j];
					nMax = j;
				} 
			}		
			mas[nMax] = mas[i];
			mas[i] = max;
		}
		
		System.out.print("mas: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
		
	}

}


/*
 * mas2 = new int[n]; int nMax = 0; for (int i = 0; i < mas.length; i++) { for
 * (int j = 0; j < mas.length; j++) { if(max <= mas[j]) { max = mas[j]; nMax =
 * j; } } mas[nMax] = 0; mas2[i] = max; max = 0; }
 * 
 * System.out.print("mas2: "); for (int i = 0; i < mas.length; i++) {
 * System.out.print(mas2[i] + ", "); } System.out.println();
 */