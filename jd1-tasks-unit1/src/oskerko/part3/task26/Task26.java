package oskerko.part3.task26;

// 26. Вывести на экран соответствий между символами и их численными обозначениями в
//     памяти компьютера (Таблицу ASCII).

public class Task26 {

	public static void main(String[] args) {
		
		int a;
		String b;
		String c;
		char ch;
		
		System.out.println("Dec   Hex   Oct   Char");
		
		for (int i = 0; i < 128; i++) {
			a = i;
			b = Integer.toHexString(i);
			c = Integer.toOctalString(i);
			ch = (char)i;
			System.out.printf("%-6d%-6s%-6s%-6s", a, b, c, ch);
			System.out.println();
		}
		
	}

}
