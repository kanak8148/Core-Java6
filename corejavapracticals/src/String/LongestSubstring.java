package String;

import java.util.HashSet;

public class LongestSubstring {
	   public static void main(String[] args) {

	        String s = "ujleujl";

	        HashSet<Character> set = new HashSet<>();

	        int left = 0;
	        int right = 0;
	        int maxLength = 0;

	        while (right < s.length()) {

	            char ch = s.charAt(right);

	            if (!set.contains(ch)) {

	                set.add(ch);

	                maxLength = Math.max(maxLength, set.size());

	                right++;

	            } else {

	                set.remove(s.charAt(left));

	                left++;

	            }
	        }

	        System.out.println(maxLength);
	    }
	}


