package oskerko.part7.task09;

import oskerko.scans.ScanInts;

/*9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно
простыми.*/

public class Task09 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		boolean chek;
		
		a = ScanInts.scanInts("a");
		b = ScanInts.scanInts("b");
		c = ScanInts.scanInts("c");
		
		chek = chek(a, b, c);
		
		System.out.println(chek);
		
	}
	
	public static boolean chek(int a, int b, int c) {
		
		boolean chek = false;
		int x = 0;
		
	    for (int i = a; i > 1 ; i--) {
			if ((a % i == 0) && (b % i == 0) && (c % i == 0)) {
				x = i;
			}
		}
		
	    if (x == 0) {
	    	chek = true;
	    }
	    
		return chek;
	}

}
