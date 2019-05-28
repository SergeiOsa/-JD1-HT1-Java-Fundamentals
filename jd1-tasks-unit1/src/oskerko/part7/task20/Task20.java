package oskerko.part7.task20;

import oskerko.scans.ScanInts;

/*20. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
Сколько таких действий надо произвести, чтобы получился нуль? 
		Для решения задачи использовать декомпозицию.*/

public class Task20 {

	public static void main(String[] args) {
		
		int n;
		int count = 0;
		
		n = ScanInts.scanInts("n, n >= 0");
		
		while(n != 0) {
			n = minus(n);
			count++;
		}
		
		System.out.println(count);
		
	}

	public static int minus(int n) {
		String s;
		int[] mas;
		
		s = Integer.toString(n);
		mas = new int[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			mas[i] = s.charAt(i) - '0';
			n = n - mas[i];
		}
		
		return n;
	}
	
}
