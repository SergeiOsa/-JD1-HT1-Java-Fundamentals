package oskerko.part7.task13;

import oskerko.scans.ScanInts;

// 13. Дано натуральное число N. Написать метод(методы) для формирования массива,
//      элементами которого являются цифры числа N.

public class Task13 {

	public static void main(String[] args) {
		
		int n;
		int[] mas;
		
		n = ScanInts.scanInts("x");
		
		mas = mas(n);
		
		System.out.println("mas:");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		
	}

	public static int[] mas(int n) {
		
		int[] mas;
		
		String str = Integer.toString(n); 
		mas = new int[str.length()];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = str.charAt(i) - '0';
		}
		
		return mas;
	}
	
	
}
