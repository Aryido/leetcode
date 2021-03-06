package leetcodePratice;

public class exercise13_LeetCode58_Length_Of_Last_Word {

	/*
	 * Given a string s consists of upper/lower-case alphabets and empty space
	 * characters ' ', return the length of last word in the string. If the last
	 * word does not exist, return 0.
	 * 
	 * Note: A word is defined as a character sequence consists of non-space
	 * characters only.
	 * 
	 * For example, Given s = "Hello World", return 5.
	 */

	public static int lengthOfLastWordFunction(String str) {
		 if (str == null || str.length() == 0) {
				return 0;
			}
			String[] strArray = str.split("\\s+");	
	        if(strArray==null||strArray.length==0){
	            return 0;
	        }
	        
			String lastString = strArray[strArray.length-1];		
			return lastString.length();
	    }

}
