package oskerko.part4.task16;

import java.util.Random;

import oskerko.scans.ScanInts;

public class Task16 {

	public static void main(String[] args) {
		
		int n;
		int[] mas;
		int max = 0;
		
		n = ScanInts.scanInts("количество натур чисел (чётное кол-во)");
		
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
		
	//	a1 a2n; a2 a2n-1; an an+1
		
		for (int i = 0; i < mas.length/2; i++) {
			if((mas[i] + mas[(mas.length - 1) - i]) > max) {
				max = (mas[i] + mas[(mas.length - 1) - i]);
			}
		}
		
		System.out.println("max=" + max);
	}

}
