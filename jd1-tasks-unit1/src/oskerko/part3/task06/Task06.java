package oskerko.part3.task06;

import oskerko.scans.ScanInts;

/*6. Напишите программу, где пользователь вводит любое целое положительное число. А
программа суммирует все числа от 1 до введенного пользователем числа.*/

public class Task06 {

	public static void main(String[] args) {

		int x;
		int sum = 0;
		
		do {
		x = ScanInts.scanInts("целое положит. число");
		} while (x <= 0);
		
		for(int i = 1; i <= x; i++) {
			sum = sum + i;
		}
		
		System.out.println("sum=" + sum);
		
	}

}
