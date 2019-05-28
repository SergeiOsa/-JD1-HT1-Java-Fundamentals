package oskerko.part3.task21;

import oskerko.scans.ScanInts;

/*21. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом
h. Результат представить в виде таблицы, первый столбец которой – значения аргумента,
второй - соответствующие значения функции:*/

public class Task21 {

	public static void main(String[] args) {

		int a;
		int b;
		int h;
		int x = 0;
		double f = 0;
		
		a = ScanInts.scanInts("a");	
		
		do {
			b = ScanInts.scanInts("b");
			if(a >= b) {
			System.out.println("b должно быть больше а");	
			}
		} while (a >= b);
		
		
		h = ScanInts.scanInts("h");

		System.out.println("x    F(x)");
		
		for (int i = a; i <= b; i = i + h) {
			x = i;
			f = i - Math.sin(i);
			System.out.printf("%02d   %01f", x, f);
			System.out.println();
		}
	}
	

	
}
