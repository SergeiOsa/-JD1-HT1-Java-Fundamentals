package oskerko.part5.task01;

import java.util.Random;

import oskerko.scans.ScanInts;

/*1. Заданы два одномерных массива с различным количеством элементов и натуральное
число k. Объединить их в один массив, включив второй массив между k-м и (k+1) - м
элементами первого, при этом не используя дополнительный массив.*/

public class Task01 {

	public static void main(String[] args) {
		
		int[] mas1;
		int[] mas2;
		int[] mas;
		
		int n1;
		int n2;
		int k;
		
        n1 = ScanInts.scanInts("количество натур чисел первого массива");
        n2 = ScanInts.scanInts("количество натур чисел второго массива");
        k = ScanInts.scanInts("k");
        
        Random rand = new Random();
		
		mas1 = new int[n1];
		mas2 = new int[n2];
		mas = new int[n1 + n2];
		
		for (int i = 0; i < n1; i++) {
			mas1[i] = rand.nextInt(100);
		}
		
		for (int i = 0; i < n2; i++) {
			mas2[i] = rand.nextInt(100);
		}
		
		System.out.print("mas1: ");
		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] + ", ");
		}
		System.out.println();
		
		System.out.print("mas2: ");
		for (int i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + ", ");
		}
		System.out.println();
		
		int j = 0;
		for (int i = 0; i < (mas1.length + mas2.length); i++) {
			if (i < k) {
				mas[i] = mas1[i]; 
			}
			if( (i >= k) && ( i < k + mas2.length ) ) {
				mas[i] = mas2[j];
				j++;
			}
			if(i >= (k + mas2.length)) {
			mas[i] = mas1[i - mas2.length];	
			}
			
		}
		
		// вывод ответа:
		System.out.print("mas: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
		
	}

}
