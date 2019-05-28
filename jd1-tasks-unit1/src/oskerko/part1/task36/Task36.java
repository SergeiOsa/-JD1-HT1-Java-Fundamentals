package oskerko.part1.task36;

import oskerko.scans.*;

// 36. Найти частное произведений четных и нечетных цифр четырехзначного числа.

public class Task36 {

	public static void main(String[] args) {

		double z; // ответ
		int x; // произв чёт
		int y; // произв нечёт
		int n; 
		
		int lenght;
		do 
		{
			n = ScanInts.scanInts(" четырёхзнач число:");
			String str = Integer.toString(n);
		    lenght = str.length();
			if(lenght !=4) {
				System.out.println("не четырёхзнач число");
			}
		}
		while(lenght!=4);
		
		int lenC = 0; // длина чёт массива
		int lenN = 0; // длина нечёт
		int temp;
		int n1 = n;
		for(int i = 0; i < 4; i++) {
			temp = n1 % 10;
			n1 = n1 / 10;
			if(temp == 0) {
				continue;
			}
			if((temp % 2) == 0) {
				lenC++;
			} else {
				lenN++;
			}
		}
		System.out.println(lenC + " " + lenN);
		
		int[] masC = new int[lenC];
		int[] masN = new int[lenN];
		
		// массив 
		System.out.println("n="+n);
		n1 = n;
		int chet = 0;
		int nech = 0;
		for(int i = 0; i < 4; i++) {
			temp = n1 % 10;
			n1 = n1 / 10;
			if(temp == 0) {
				continue;
			}
			if((temp % 2) == 0) {
				masC[chet] = temp;
				chet++;
			} else {
				masN[nech] = temp;
				nech++;
			}
		}
		
		System.out.print("Чёт: ");
		for(int i = 0; i < lenC; i++) {
			System.out.print(masC[i] + " ");
		}
		System.out.println();

		System.out.print("Нечёт: ");
		for(int i = 0; i < lenN; i++) {
			System.out.print(masN[i] + " ");
		}
		System.out.println();
		
		x = 1;
		for (int i = 0; i < lenC; i++) {
			x = x * masC[i];
		}
		
		y = 1;
		for (int i = 0; i < lenN; i++) {
			y = y * masN[i];
		}
		
		z = (double) x / y;
		
		System.out.println("Ответ: " + z);
	}

}
