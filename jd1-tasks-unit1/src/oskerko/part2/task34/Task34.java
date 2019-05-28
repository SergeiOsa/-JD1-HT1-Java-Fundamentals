package oskerko.part2.task34;

import java.util.Random;

import oskerko.scans.ScanInts;

/*34. Составить программу, реализующую эпизод применения компьютера в книжном магазине. 
Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется,
печатает на экране «спасибо»; если денег внесено больше, чем необходимо, 
то печатает «возьмите сдачу» и указывает сумму сдачи; если денег недостаточно, то печатает сообщение
об этом и указывает размер недостающей суммы.*/

public class Task34 {

	public static void main(String[] args) {

		int a; 
		int b;
		int z = 0;
		
		Random rand = new Random();
		b = rand.nextInt(100);
		System.out.println("Книга стоит " + b +" руб.");
		
		a = ScanInts.scanInts(" a");
		System.out.println("Вы внесли " + a + " руб.");
		
		if(a >= b) {
			if (a == b) {
				System.out.println("Спасибо");
			} else {
				z = a - b;
				System.out.println("Возьмите сдачу " + z + " руб.");
			}
				
		} else {
			z = b - a;
			System.out.println("Денег недостаточно. Необходимо ещё " + z + " руб.");
		}
	}

}
