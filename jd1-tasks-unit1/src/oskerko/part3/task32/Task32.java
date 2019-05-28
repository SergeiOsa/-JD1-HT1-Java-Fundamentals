package oskerko.part3.task32;

import java.util.Scanner;

/*32. Проверить введенную пользователем строку на наличие недопустимых символов.
В качестве первого символа допустимы только буквы и знак подчеркивания. 
Остальные символы могут быть буквами, цифрами и знаком подчеркивания.*/

//48-57(цифры)  65-90 95 97 122

public class Task32 {

	public static void main(String[] args) {
		
		String str;
		char ch;
		int a;
		int b;
		char[] chMas;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите строку.\r\n" + 
				"В качестве первого символа допустимы только буквы и знак подчеркивания. \r\n" + 
				"Остальные символы могут быть буквами, цифрами и знаком подчеркивания.");
		
		do {
			System.out.println("Введите строку");
			str = sc.nextLine();
			ch = str.charAt(0);
			a = ch;
			b = str.length();
			chMas = str.toCharArray();
			for (int i = 0; i < b; i++) {
				if ((chMas[i] != 95 ) && (chMas[i] < 65 || chMas[i] > 90) && (chMas[i] < 97 || chMas[i] > 122)  && (chMas[i] < 48 || chMas[i] > 57)) {
					a = 0;
					break;
				}
			}
		} while ((a != 95 ) && (a < 65 || a > 90) && (a < 97 || a > 122));	
		
		System.out.println("У вас получилось");
		
	}

}
