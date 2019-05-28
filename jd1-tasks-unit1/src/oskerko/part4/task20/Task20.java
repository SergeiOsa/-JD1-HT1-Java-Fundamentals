package oskerko.part4.task20;

import java.util.Random;

import oskerko.scans.ScanInts;

/*20. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него
каждый второй элемент (освободившиеся элементы заполнить нулями). Примечание.
Дополнительный массив не использовать*/

public class Task20 {

	public static void main(String[] args) {
		
		int n;
		int[] mas;
		
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
		
		for (int i = 1; i < mas.length; i = i + 2) {
			mas[i] = 0;
		}
		
		System.out.print("mas: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
		
	}

}
