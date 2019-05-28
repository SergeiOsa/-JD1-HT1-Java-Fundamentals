package oskerko.part4.task13;

/*13. Определить количество элементов последовательности натуральных чисел, кратных
числу М и заключенных в промежутке от L до N.*/

import java.util.Random;

import oskerko.scans.ScanInts;

public class Task13 {
	
	public static void main(String[] args) {
		
		int x;
		int[] mas;
		int l;
		int n;
		int m;
		int count = 0;
		
		x = ScanInts.scanInts("количество натур чисел");
		l = ScanInts.scanInts("L");
		n = ScanInts.scanInts("N");
		m = ScanInts.scanInts("M");

		Random rand = new Random();
		
		mas = new int[x];
		
		for (int i = 0; i < x; i++) {
			mas[i] = rand.nextInt(100);
		}
		
		System.out.print("mas: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
		
		for (int i = 0; i < mas.length; i++) {
			if(mas[i] % m == 0 && (mas[i] > l && mas[i] < n )) {
				count++;
			}
		}
		
		System.out.println("count=" + count);
	}

}
