package leetcodePratice;

import java.util.Arrays;

public class exercise31_LeetCode14_Longest_Common_Prefix {

	/*
	 	Write a function to find the longest common prefix string amongst an array of strings.
		If there is no common prefix, return an empty string "".
		
		Example 1:
				Input: ["flower","flow","flight"]
				Output: "fl"
				
		Example 2:
				Input: ["dog","racecar","car"]
				Output: ""
				
		Explanation: There is no common prefix among the input strings.
		
		Note:
			All given inputs are in lowercase letters a-z.
	 */
	
	 //LEETCODE
	 public static String longestCommonPrefix(String[] strs) {
		 if (strs.length == 0) return "";
		    String prefix = strs[0];
		    for (int i = 1; i < strs.length; i++)
		        while (strs[i].indexOf(prefix) != 0) {
		            prefix = prefix.substring(0, prefix.length() - 1);
		            if (prefix.isEmpty()) return "";
		        }
		    System.out.println(prefix);
		    return prefix;
	 }
	
	 
	 public static String longestCommonPrefix2(String[] strs) {
		 String ans="";
		 
		 if (strs.length == 0) {
			 return "";
		 }
		 
		 int[] lengthArray = new int[strs.length];
		 for(int i=0;i<strs.length;i++) {
			 lengthArray[i]=strs[i].length();
		 }
		 Arrays.sort(lengthArray);
		 int minLength=lengthArray[0];
		 
		 
		L:
		for(int j=0;j<minLength;j++) {
			for(int k=1;k<strs.length;k++) {
				if(strs[0].charAt(j)!=strs[k].charAt(j)) {
					 break L;
				}
			}
			ans=ans+strs[0].charAt(j);
		}
		 
		 
		 System.out.println(ans);
		 return ans;
	 }
	
	 
	
	 
	
	public static void main(String[] args) {
		String[] strs= {"flower","flow","flight"};
		longestCommonPrefix2(strs);
		
	}

}
