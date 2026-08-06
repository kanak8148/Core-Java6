package String;

public class TestHeapAndLiteral {
	// 1. when you create String object using "" it goes to literal pool
	// 2. when you create String object using new key word it goes to heap memory

	public static void main(String[] args) {

		String s1 = "SUNRAYS";
		String s2 = "SUNRAYS";

		String s3 = new String("SUNRAYS");
		String s4 = new String("SUNRAYS");

		System.out.println(s1 == s2);//By Object
	    System.out.println(s3.equals(s4));//By Value
	    System.out.println(s3 == s4);
	    

	}

}