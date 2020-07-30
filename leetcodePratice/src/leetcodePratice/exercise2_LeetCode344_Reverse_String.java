package leetcodePratice;

import java.util.ArrayList;

public class exercise2_LeetCode344_Reverse_String {

	/*
	Write a function that takes a string as input and returns the string reversed.
	Example: Given s = "hello", return "olleh".
	*/
	
	/**
	 * solution1
	 */
	public static void reverseString(String string) {
		String[] stringArray = string.split("");
		StringBuilder sb = new StringBuilder();
		for(int i=stringArray.length-1;i>=0;i--) {
			//System.out.println(stringArray[i]);
			sb.append(stringArray[i]);
		}
		System.out.println(sb);
	}
	
//	public static void reverseString2(String string) {
//		StringBuilder sb = new StringBuilder();
//		sb.append(string);
//		sb.reverse();
//		System.out.println(sb);
//	}
	
	public static void reverseString2(char[] s) {
		StringBuilder sb = new StringBuilder();
		for(char p:s) {
			sb.append(p);
		}
		sb.reverse();
		
        System.out.println(sb);
    }
	
	//LEETCODE
	 public void reverseString3(char[] s) {
	        int left = 0, right = s.length - 1;
	        while (left < right) {
	            char tmp = s[left];
	            s[left] = s[right];
	            s[right] = tmp;
	            left++;
	            right--;
	        }
	    }
	
	public static void main(String[] args) {
		
		String s="hello";
		reverseString(s);
		
		char[] p= {'h','e','l','l','o'};
		reverseString2(p);
		
	}

}
