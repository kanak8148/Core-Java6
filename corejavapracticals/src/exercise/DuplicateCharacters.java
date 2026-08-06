package exercise;

public class DuplicateCharacters {
	public static void main(String[] args) {
		
	
	  String s = "programming";

      for (int i = 0; i < s.length(); i++) {

          boolean duplicate = false;

          for (int j = 0; j < i; j++) {

              if (s.charAt(i) == s.charAt(j)) {
                  duplicate = true;
                  break;
              }
          }

          if (!duplicate) {
              System.out.print(s.charAt(i));
          }
      }
  }

}
