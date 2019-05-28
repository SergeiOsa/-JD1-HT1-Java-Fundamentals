package oskerko.part4.task05;

import java.util.Random;

import oskerko.scans.ScanInts;

/*5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных
чисел этой последовательности. Если таких чисел нет, то вывести сообщение об этом факте.
*/
public class Task05 {

	public static void main(String[] args) {
		
		int n;
		int[] mas;
		
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
		
		int l = 0;
		for (int i = 0; i < mas.length; i++) {
			if(mas[i] % 2 == 0) {
				l++;
			}
		}
		
		int[] mas2 = new int[l];
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if(mas[i] % 2 == 0) {
				mas2[j] = mas[i];
				j++;
			}
		}
		System.out.print("mas2: ");
		for (int i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + ", ");
		}
	}

}
