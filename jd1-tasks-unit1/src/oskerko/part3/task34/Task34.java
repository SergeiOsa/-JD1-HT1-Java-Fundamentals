package oskerko.part3.task34;

// 34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.

public class Task34 {

	public static void main(String[] args) {
		
		int a1;
		int a2;
		int a3;
		int a4;
		int b;
		int c;
		
		for (int i = 1000; i < 10000; i++) {
			b = i;
			a1 =  b % 10;
			b = b / 10;
			a2 = b % 10;
			b = b / 10;
			a3 = b % 10;
			b = b / 10;
			a4 = b % 10;
			c = a1 + a2 + a3 + a4;
			if (c == 15) {
				System.out.println(i);
			}
		}
		System.out.println("всё");
		
	}

}
