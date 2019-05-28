package oskerko.part3.task13;

// 13. Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.

public class Task13 {

	public static void main(String[] args) {

		double y;
		
		System.out.println("x:          y:");
		for(double x = -5; x <=5; x = x + 0.5) {
			y = 5 - x*x/2;
			System.out.printf("% f   % f", x, y);
			System.out.println();
		}
		
	}

}
