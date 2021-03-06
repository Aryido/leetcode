package leetcodePratice;

import java.util.HashMap;

public class exercise6_LeetCode242_Vaild_Anagram {

	/*
	 	Given two strings s and t, write a function to determine if t is an anagram of s.
		For example,
		s = "anagram", t = "nagaram", return true.
		s = "rat", t = "car", return false.
		Note:
		You may assume the string contains only lowercase alphabets.
	 */
	
	
	/**
	 * 	使用map存入字串再來比較
	 * 
	 */
	public static Boolean anagramFuntion(String prototypeStrng, String string) {
		//字長度不一樣 一定非重組字
		if(prototypeStrng.length()!=string.length()) {
			return false;
		}
		
		String[] prototypeArray = prototypeStrng.split("");
		String[] stringArray = string.split("");
		
		 HashMap<String, String> map = new HashMap<String,String>();
		 for(String p:prototypeArray) {
			 map.put(p,p);
		 }
		
		 for(String s:stringArray) {
			 if(!map.containsKey(s)) {
				 break;
			 }
			 return true;
		 }
				
		return false;
	}
	
	
	public static void main(String[] args) {
		Boolean ans = anagramFuntion("aapa", "paaa");
		System.out.println(ans);

	}

}
