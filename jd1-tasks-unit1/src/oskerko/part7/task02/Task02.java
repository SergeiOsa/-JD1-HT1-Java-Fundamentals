package oskerko.part7.task02;

import oskerko.scans.ScanInts;

/*2. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего
общего кратного двух натуральных чисел:
*/

public class Task02 {

	public static void main(String[] args) {

		int nod;
		int nok;

		int a;
		int b;

		a = ScanInts.scanInts("a");
		do {
			b = ScanInts.scanInts("b, b > a");
		} while (b < a);

		nok = nok(a, b);
		nod = nod(a, b);

		System.out.println("nok=" + nok);
		System.out.println("nod=" + nod);

	}

	public static int nok(int a, int b) {

		int nok = 0;

		for (int i = 2; i <= b; i++) {
			if ((a % i == 0) && (b % i == 0)) {
				nok = i;
				break;
			}
		}

		return nok;
	}

	public static int nod(int a, int b) {

		int nod = 0;

		for (int i = b; i >= 1; i--) {
			if ((a % i == 0) && (b % i == 0)) {
				nod = i;
				break;
			}
		}

		return nod;
	}

}
