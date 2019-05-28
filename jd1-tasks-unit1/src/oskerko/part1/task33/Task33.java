package oskerko.part1.task33;

import java.util.Scanner;

// 33. Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.


public class Task33 {

	public static void main(String[] args) {
		
		int x;
		int x1;
		int x2;
		String str;
		char ch;
		char ch1;
		char ch2;		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите 1 символ");
		str = sc.next();
		char[] charArray = str.toCharArray();
	    ch = charArray[0];
		
		while(charArray.length > 1) {
		
			System.out.println("Вы ввели больше 1 символа");
			System.out.println("Введите 1 символ");
			str = sc.next();
			charArray = str.toCharArray();
			ch = charArray[0];
			
		}
		
		x = ch;
		System.out.println("Порядковый номер = " + x);
		
		x1 = x - 1;
		x2 = x + 1;
		ch1 = (char) x1;
		ch2 = (char) x2;
		
		System.out.println("Пред. символ: " + ch1);
		System.out.println("След. символ: " + ch2);
			
	}
	
}
