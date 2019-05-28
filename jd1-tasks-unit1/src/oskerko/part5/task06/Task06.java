package oskerko.part5.task06;

import java.util.Random;

import oskerko.scans.ScanInts;

/*6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его
по возрастанию. Делается это следующим образом: сравниваются два соседних элемента
ai и ai+1 . Если ai<=ai+1, то продвигаются на один элемент вперед.
 Если ai>ai+1, то производится
перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.*/

public class Task06 {

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
		
		int a;
		for (int j = 0; j < mas.length - 1; j++) {
			
		
		for (int i = 0; i < mas.length - 1; i++) {
			if(mas[i] <= mas[i+1]) {
				continue;
			} else {
				a = mas[i];
				mas[i] = mas[i + 1];
				mas[i + 1] = a;
			}
		}}
		
		System.out.print("mas: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
		
	}

}
