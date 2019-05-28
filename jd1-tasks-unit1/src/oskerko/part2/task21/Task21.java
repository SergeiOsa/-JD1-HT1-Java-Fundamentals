package oskerko.part2.task21;

import oskerko.scans.*;

/*21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». 	
		В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или 
		«Мне нравятся мальчики!».*/

public class Task21 {

	public static void main(String[] args) {

		char ch;
		String s;
		
		System.out.print("Кто ты: мальчик или девочка? Введи ");
		
		do {
			ch = ScanChars.scanChars("Д или М");
			s = String.valueOf(ch);
		}
		while (!s.equals("Д") && !s.equals("М") && !s.equals("д") && !s.equals("м"));
		
		if (s.equals("Д") || s.equals("д")) {
			System.out.println("Мне нравятся мальчики!");
		} else {
			System.out.println("Мне нравятся девочки!");
		}
	}

}
