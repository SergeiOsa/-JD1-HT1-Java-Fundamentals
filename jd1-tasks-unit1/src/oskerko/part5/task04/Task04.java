package oskerko.part5.task04;

import java.util.Arrays;
import java.util.Random;

import oskerko.scans.ScanInts;

/*4. Сортировка обменами. Дана последовательность чисел a1<=a2<= ...<=an 
.Требуется
переставить числа в порядке возрастания. Для этого сравниваются два соседних числа
ai и ai+1 . Если ai>ai+1, то делается перестановка. Так продолжается до тех пор, пока все
элементы не станут расположены в порядке возрастания. Составить алгоритм сортировки,
подсчитывая при этом количества перестановок.
*/

public class Task04 {

	public static void main(String[] args) {

		int n;
		int[] mas;

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

		int a;
		for (int j = 0; j < mas.length - 1; j++) {
			for (int i = 0; i < mas.length - 1; i++) {
				if (mas[i] < mas[i + 1]) {
					a = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = a;
				}
			}
		}
		
		System.out.print("mas: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
	}

}
