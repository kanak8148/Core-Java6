package array;

public class TestArrayMax {
	
	public static void main(String[] args) {

		int[] arr = { 10, 11, 5, 88, 13, 17 };

		int max = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];

			}
		}

		System.out.println("maximum: " + max);
	}
}


