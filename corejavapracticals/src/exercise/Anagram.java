package exercise;

import java.util.Arrays;

public class Anagram {
	 public static void main(String[] args) {

	        String s1 = "listen";
	        String s2 = "silent";

	        char a[] = s1.toCharArray();//{l,i,s,t,e,n}
	        char b[] = s2.toCharArray();

	        Arrays.sort(a);//Sort Method For sorting
	        Arrays.sort(b);

	        if (Arrays.equals(a, b)) {//equals method for checking two array
	            System.out.println("String is Anagram");
	        } else {
	            System.out.println("String is Not Anagram");
	        }
	    }
	}


