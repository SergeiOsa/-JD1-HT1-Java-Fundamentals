package oskerko.part3.task31;

import java.util.Random;

import oskerko.scans.ScanInts;

/*  31. Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их угадать. 
Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала программа,
а также ошибочные числа пользователя.*/

public class Task31 {

	public static void main(String[] args) {

		int a;

		int[] mas = new int[5];
		int[] userMas = new int[5];
		int[] noUser = new int[5];

		Random rand = new Random();

		// создаём массив из рандомных чисел:
		for (int i = 0; i < 5; i++) {
			mas[i] = rand.nextInt(16);
			if (mas[i] == 0) {
				i--;
				continue;
			}
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					continue;
				}
				if (mas[i] == mas[j]) {
					i--;
					break;
				}

			}

		}

		// создаём массив введённых чисел:
		for (int i = 0; i < 5; i++) {
			a = ScanInts.scanInts("число");
			userMas[i] = a;
		}

		// Выводим рандом массив:
		System.out.print("Random: ");
		for(int i = 0; i < 5; i++) {
			System.out.print(mas[i] + "; ");
		}
		System.out.println();
		
		// Выводим попадания и в ячейки рандом и пользователь массивов присваиваем 0, чтобы потом вывести по иф>0
		System.out.print("Есть: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (userMas[j] == mas[i]) {
					if(userMas[j] > 0) {                      // если не ставлю иф, то бывает печатает 0
						System.out.print(userMas[j] + "; ");
					}
					mas[i] = 0;
					userMas[j] = 0;
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			noUser[i] = userMas[i];
		}

		System.out.println();
		System.out.print("Неугаданные: ");

		for (int i = 0; i < 5; i++) {
			if (mas[i] > 0) {
				System.out.print(mas[i] + "; ");
			}
		}

		System.out.println();
		System.out.print("Ошибочные числа пользователя: ");

		for (int i = 0; i < 5; i++) {
			if (noUser[i] > 0) {
				System.out.print(noUser[i] + "; ");
			}
		}

	}

}