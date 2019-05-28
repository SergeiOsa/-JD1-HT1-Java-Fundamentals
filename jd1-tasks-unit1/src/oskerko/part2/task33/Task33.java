package oskerko.part2.task33;

import oskerko.scans.*;

/* 33. Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной
информации в базе данных. Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа.
Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С;
3331, 7922 — доступны модули баз В, С; 9455, 8997 — доступен модуль базы С.
*/

public class Task33 {

	public static void main(String[] args) {
		
		String a;
		String b;
		String c;
		
		int pass;

		a = "A";
		b = "B";
		c = "C";
		
		pass = ScanInts.scanInts(" password");
		
		if((pass == 9583) || (pass == 1747) || (pass == 3331) 
				|| (pass == 7922) || (pass == 9455) || (pass == 8997 )) {
			if((pass == 9583) || (pass == 1747)) {
				System.out.println("Доступны модули: " + a + ", " + b + ", " + c);
			}
			if((pass == 3331) || (pass == 7922)) {
				System.out.println("Доступны модули: " + b + ", " + c);
			}
			if((pass == 9455) || (pass == 8997)) {
				System.out.println("Доступен модуль " + c);
			}
		} else {
			System.out.println("Wrong password");
		}

	}
	
}
