package oskerko.part3.task36;

/*36. Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, 
которое делится на их произведение. Найти эти числа.*/

public class Task36 {

	public static void main(String[] args) {

		int a;
		int b;

		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				a = (i * 100) + j;
				b = i * j;
				if (a % b == 0) {
					System.out.println("i=" + i + ", j=" + j + ";");
				}
			}
		}
		
	}

}
