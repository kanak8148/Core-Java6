package exercise;

public class FibonacciSeries {
	//previous 2 numbers ka sum hota hai
	
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		for (int i = 1; i <= 10; i++) {
			c = a + b;
			System.out.print(a + " ");
			a = b;
			b = c;
		}
	}

	
}

