package exercise;

public class ArmStrongNo {

	public static void main(String[] args) {

		int num = 153;

		int a = num % 10; // last digit
		int b = (num / 10) % 10; // middle digit
		int c = num / 100;       // first digit
		

		int sum = a*a*a +   b*b*b + c*c*c;

		if (sum == num) {
		    System.out.println("Armstrong No");
		} else {
		    System.out.println("Not Armstrong No");
		}
}
}
