package corejavapracticals;

public class Tables {
	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				//System.out.print(i * j + "\t");
				System.out.print(j + "x" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}

}
}
