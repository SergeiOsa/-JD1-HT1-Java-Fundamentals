package oskerko.part4.task02;

import java.util.Scanner;

/*2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров
этих элементов.*/

public class Task02 {

	public static void main(String[] args) {

		String str;
		int l;
		int l2 = 0;
		char[] mas;
		int[] mas2;

		Scanner sc = new Scanner(System.in);

		System.out.println("введите цифры без пробелов");
		str = sc.next();
		l = str.length();
		mas = str.toCharArray();

		for (int i = 0; i < l; i++) {
			if (mas[i] == '0') {
				l2++;
			}
		}

		int j = 0;
		mas2 = new int[l2];
		for (int i = 0; i < l; i++) {
			if (mas[i] == '0') {
				mas2[j] = i;
				j++;
			}
		}

		for (int i = 0; i < l2; i++) {
			System.out.print(mas2[i] + ", ");
		}

	}

}
