package oskerko.part3.task18;

import oskerko.scans.ScanInts;

/*18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых
больше или равен заданному е. Общий член ряда имеет вид:*/


public class Task18 {

	public static void main(String[] args) {
		
		double a;
		int n;
		int e;
		double sum = 0;
		
		e = ScanInts.scanInts("e");		
		n = ScanInts.scanInts("n");
		
		for (int i = 1; i <= n; i++) {
			a = Math.pow(-1, i - 1) / i;
			if (Math.abs(a) >= e) {
				sum = sum + a;
			}
		}
		
		System.out.println("sum=" + sum);
		
	}

}
