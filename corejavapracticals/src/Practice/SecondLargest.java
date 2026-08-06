package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {
	
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20 , 30 , 40 , 50);
		int secondLargest = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
		
		System.out.println(secondLargest);
	}

}
