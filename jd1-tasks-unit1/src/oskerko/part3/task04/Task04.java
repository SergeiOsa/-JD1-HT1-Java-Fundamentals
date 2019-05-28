package oskerko.part3.task04;

// 4. С помощью оператора while напишите программу вывода всех четных чисел в диапазоне
//     от 2 до 100 включительно.

public class Task04 {

	public static void main(String[] args) {

		int x;
		
		x = 2;
		
		while(x < 101) {
			System.out.print(x + " ");
			x = x + 2;
		}
		
	}

}
