package leetcodePratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class exercise21_LeetCode345_Reverse_Vowels_Of_String {

	/*
	 	Write a function that takes a string as input and reverse only the vowels of a string.

		Example 1:
		
				Input: "hello"
				Output: "holle"
				
		Example 2:
		
				Input: "leetcode"
				Output: "leotcede"
		Note:
				The vowels does not include the letter "y".
	 */
	
	
	public String reverseVowels(String s) {	
		String ans="";
		//	母音字
		HashSet set = new HashSet<String>();
		set.add("a");
		set.add("e");
		set.add("i");
		set.add("o");
		set.add("u");
        set.add("A");
		set.add("E");
		set.add("I");
		set.add("O");
		set.add("U");
		
		String[] arrayStr = s.split("");
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		int index=0;
		for(int i=0;i<s.length();i++) {
			if(set.contains(arrayStr[i])) {
				map.put(index,arrayStr[i]);
				index++;
			}	
		}
		
		
		int a = map.size()-1;
		for(int i=0;i<s.length();i++) {
			if(set.contains(arrayStr[i])) {
				arrayStr[i]=map.get(a--);
			}
		}
		
		StringBuffer sb = new StringBuffer();
		for(String p:arrayStr) {
			sb.append(p);
		}
		
		ans=sb.toString();
		
		return ans;
	}

	public static void main(String[] args) {
		exercise21_LeetCode345_Reverse_Vowels_Of_String leetCode345 = new exercise21_LeetCode345_Reverse_Vowels_Of_String();
		
		String s="leetcode";
		
		System.out.println(leetCode345.reverseVowels(s));
	}

}
