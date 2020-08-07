package leetcodePratice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class exercise10_LeetCode205_Isomorphic_Strings {

	/*
	 	Given two strings s and t, determine if they are isomorphic.
		Two strings are isomorphic if the characters in s can be replaced to get t.
		All occurrences of a character must be replaced with another character while preserving the order of characters. 
		No two characters may map to the same character but a character may map to itself.
		
		For example, 
			Given "egg", "add", return true.
			
			Given "foo", "bar", return false.
			
			Given "paper", "title", return true.
	 */
	
	//LEETCODE
	public static boolean isIsomorphic(String s, String t) {		
	        if (s.length() != t.length()) {
	            return false;
	        }
	        //s=egg
	        //t=add
	        Set<Character> tCharsSeen = new HashSet<>();
	        Map<Character, Character> charMap = new HashMap<>(); // s -> t mapping
	        for (int i = 0; i < s.length(); i++) {
	            char sChar = s.charAt(i);
	            char tChar = t.charAt(i);
	            if (!charMap.containsKey(sChar)) {
	                if (tCharsSeen.contains(tChar)) {
	                    return false;
	                }
	                tCharsSeen.add(tChar);
	                charMap.put(sChar, tChar);
	            } else {
	                char tMapping = charMap.get(sChar);
	                if (tMapping != tChar) {
	                    return false;
	                }
	            }
	        }

	        return true;
	    }
    
	
	public static void main(String[] args) {
		
		String s="abab";
		String t="baba";
		System.out.println(isIsomorphic(s, t));
	}

}
