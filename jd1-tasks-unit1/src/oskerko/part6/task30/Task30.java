package oskerko.part6.task30;

import java.util.Random;

/*30. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму
матрицу и номера строк, в которых число 5 встречается три и более раз.
*/

public class Task30 {

	public static void main(String[] args) {

		int[][] mas = new int[10][20];

		Random r = new Random();

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				mas[i][j] = r.nextInt(16);
			}
		}

		System.out.println("mas: ");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.printf("% -5d", mas[i][j]);
			}
			System.out.println();
		}

		int count = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				if (mas[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				System.out.println("В строке №" + (i + 1) + " 5 встречается " + count + " раз(а).");
			}
			count = 0;

		}
		
	}

}
