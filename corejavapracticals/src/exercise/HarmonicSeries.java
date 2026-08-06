package exercise;

public class HarmonicSeries {
	//1 ke division wale terms ka addition
		 public static void main(String args[]) {

		        double sum = 0;

		        for (int i = 1; i <= 10; i++) {

		            double term = 1.0 / i;   // 1/i ka actual value
		            sum = sum + term;       // sum me add karna

		            System.out.println("Term: 1/" + i + " = " + term);
		        }

		        System.out.println("Harmonic Series Sum = " + sum);
		    }
	}


