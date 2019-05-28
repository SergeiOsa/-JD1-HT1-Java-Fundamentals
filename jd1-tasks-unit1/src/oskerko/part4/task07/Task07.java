package oskerko.part4.task07;

import java.util.Random;

import oskerko.scans.ScanInts;

/*7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
большие данного Z, этим числом. Подсчитать количество замен.
*/

public class Task07 {

	public static void main(String[] args) {
		
		int n;
		int z;
		int[] mas;
		int count = 0;

		
		n = ScanInts.scanInts("количество натур чисел");
		z = ScanInts.scanInts("Z");
		
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
			if(mas[i] > z) {
				mas[i] = z;
				count++;
			}
		}
		
		System.out.print("mas2: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
		
		System.out.println("Количество замен: " + count);
		
	}

}
