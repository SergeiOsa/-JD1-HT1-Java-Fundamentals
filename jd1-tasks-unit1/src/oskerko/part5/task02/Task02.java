package oskerko.part5.task02;

import java.util.Arrays;

import java.util.Random;

import oskerko.scans.ScanInts;

/*2. Даны две последовательности
a1<a2...<an  и  b1<b2<...bn.  Образовать из них новую
последовательность чисел так, чтобы она тоже была неубывающей. Примечание.
Дополнительный массив не использовать.*/

public class Task02 {

	public static void main(String[] args) {
		
		int[] mas1;
		int[] mas2;
		int[] mas;
		
		int n1;
		int n2;
		
        n1 = ScanInts.scanInts("количество натур чисел первого массива");
        n2 = ScanInts.scanInts("количество натур чисел второго массива");
        
        Random rand = new Random();
		
		mas1 = new int[n1];
		mas2 = new int[n2];
		mas = new int[n1 + n2];
		
		for (int i = 0; i < n1; i++) {
			mas1[i] = rand.nextInt(100);
		}
		Arrays.sort(mas1);
		
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
		
		mas = Arrays.copyOf(mas1, n1 + n2);
		for (int i = n1; i < mas.length; i++) {
			mas[i] = mas2[i-n1];
		}
		Arrays.sort(mas);
		
		System.out.print("mas: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		
	}

}
