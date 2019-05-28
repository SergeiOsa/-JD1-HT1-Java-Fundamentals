package oskerko.part3.task09;

// 9. Найти сумму квадратов первых ста чисел.

public class Task09 {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i = 0; i <= 99; i++) {
			sum = sum + i * i;
		}
		System.out.println(sum);
	}

}
