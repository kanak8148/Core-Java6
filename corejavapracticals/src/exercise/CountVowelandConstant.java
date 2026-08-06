package exercise;

public class CountVowelandConstant {
	  public static void main(String[] args) {

	        String s = "Kanak";

	        int vowel = 0;
	        int consonant = 0;

	        for (int i = 0; i < s.length(); i++) {

	            char ch = Character.toLowerCase(s.charAt(i));

	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                vowel++;
	            } else if (ch >= 'a' && ch <= 'z') {
	                consonant++;
	            }
	        }

	        System.out.println("Vowels = " + vowel);
	        System.out.println("Consonants = " + consonant);
	    }
	}


