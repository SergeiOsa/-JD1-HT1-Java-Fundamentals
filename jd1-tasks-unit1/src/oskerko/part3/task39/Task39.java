package oskerko.part3.task39;

/*39. В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7,
то получили исходное число. Найти это число.*/

public class Task39 {

	public static void main(String[] args) {

		// xyz = 7 * yz

		int a;

		int b;
		int n;

		int y;
		int z;
		for (int i = 100; i < 1000; i++) {
			a = i;
			b = i; // когда не присваиваю b = i зависает и не правильно работает. не понимаю почему.
			z = b % 10;
			b = b / 10;
			y = b % 10;

			n = ((y * 10) + z) * 7;
			if (n == a) {
				System.out.println(a);
			}
		}

		System.out.println("Получилось");
	}

}
