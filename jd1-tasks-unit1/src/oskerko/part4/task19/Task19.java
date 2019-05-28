package oskerko.part4.task19;

import java.util.Random;

import oskerko.scans.ScanInts;

// 19. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся
       // число. Если таких чисел несколько, то определить наименьшее из них.

public class Task19 {

	public static void main(String[] args) {
		
		int n;
		int[] mas;
		int[] mas2;
		int l = 0;
		
		// Создаём рандом массив длинной n:
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
		
				
		// узнаём длину мас2:
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if(i == j) {
					continue;
				}
				if(mas[i] == mas[j]) {
					l++;
				}
			}
		}
		
		// Сравниваем элементы массива между собой:
		mas2 = new int[l];
		int[] masCount = new int[n];
		int k = 0;
		int count = 1;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if(i == j) {
					continue;
				}
				if (mas[i] == mas[j]) {
					mas2[k] = mas[j];
					k++;
					count++;
				}
			}
			masCount[i] = count;
			count = 1;
		}
		
		// выводим мас2:
		System.out.print("mas2: ");
		for (int i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + ", ");
		}
		System.out.println();
		
		// Выводим кол-во совпадений:
		System.out.print("masCount: ");
		for (int i = 0; i < masCount.length; i++) {
			System.out.print(masCount[i] + ", ");
		}
		System.out.println();
		
		// кол-во мах совпад:
		int max = 1;
		for (int i = 0; i < masCount.length; i++) {
			if (masCount[i] > max) {
				max = masCount[i];
			}
		}
		
		// массив из номеров маx:
		int[] nMax = new int[l];
		int q = 0;
		for (int i = 0; i < masCount.length; i++) {
			if(masCount[i] == max) {
				nMax[q] = i;
				q++;
			}
		}
		
		int min = 2147483647;
		for (int i = 0; i < nMax.length; i++) {
			if (mas[nMax[i]] < min) {
				min = mas[nMax[i]];
			}
		}
		
		System.out.println("min=" + min);
		
	}

}
